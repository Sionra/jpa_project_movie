package Deserializer.Classes;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class UniversalDeserializer<T> extends JsonDeserializer<T> {

    private final Class<T> clazz;
    //  <classe, <id : objet> > seenIdsMAp
    private static final Map<Class<?>, Map<String, Object>> seenIdsMap = new HashMap<>();

    public UniversalDeserializer(Class<T> clazz) {  // constructeur
        this.clazz = clazz;
        // s'il n'y a pas la classe en tant que clé de la map globale, on crée une hashmap
        seenIdsMap.putIfAbsent(clazz, new HashMap<String,Object>());
    }

    @Override
    public T deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        JsonNode node = p.getCodec().readTree(p);

        JsonNode idNode = node.get("id");
        if (idNode == null) {
            idNode = node.get("identite"); // Realisateur Id
        }
        if (idNode == null) {
            idNode = node.get("genres"); // Genres Id
        }
        if (idNode == null) {
            idNode = node.get("nom"); // Pays Id
        }

        T obj;  // déclaration
        String id = idNode.asText();
        Map<String, Object> seenIds = seenIdsMap.get(clazz);

        // Gestion de doublons
        if (idNode!=null) {
            if (seenIds.containsKey(id)) {
                try {
                    obj = (T) seenIds.get(id);
                    return obj; // cast Object -> T
                }
                catch (Exception e){
                    return null;
                }
            }
        }

        // Si pas de doublons
        try {
            obj = clazz.getDeclaredConstructor().newInstance(); // instanciation

            // Définir les autres champs si nécessaires en utilisant `set` méthodes ou par réflexion
            for (var field : clazz.getDeclaredFields()) {
                field.setAccessible(true);
                JsonNode fieldNode = node.get(field.getName());
                if (fieldNode != null) {
                    Object value = p.getCodec().treeToValue(fieldNode, field.getType());
                    field.set(obj, value); // je donne à ce field (attribut) de l'objet la value
                }
            }
        } catch (Exception e) {
            throw new IOException("Erreur lors de la création de l'instance de la classe " + clazz.getSimpleName(), e);
        }

        seenIds.put(id, obj);
        return obj;
    }
}