package Deserializer.Classes;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class UniversalDeserializer<T> extends JsonDeserializer<T> {

    private final Class<T> clazz;
    private static final Map<Class<?>, Map<String, Object>> seenIdsMap = new HashMap<>();

    public UniversalDeserializer(Class<T> clazz) {  // universel
        this.clazz = clazz;
        seenIdsMap.putIfAbsent(clazz, new HashMap<>());
    }

    @Override
    public T deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        ObjectMapper mapper = (ObjectMapper) p.getCodec();
        T obj = mapper.readValue(p, clazz);

        // Obtenir l'ID
        String id = null;
        try {
            var idField = clazz.getDeclaredField("id");
            idField.setAccessible(true);
            id = (String) idField.get(obj);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new IOException("Champ ID non trouvé", e);
        }

        // Vérifier si doublon d'ID
        Map<String, Object> seenIds = seenIdsMap.get(clazz);
        if (id != null && seenIds.containsKey(id)) {
            throw new IOException("Doublons d'ID trouvés pour cette classe " + clazz.getSimpleName() + ": " + id);
        }

        // Ajoute l'ID à la map
        seenIds.put(id, obj);
        return obj;
    }
}