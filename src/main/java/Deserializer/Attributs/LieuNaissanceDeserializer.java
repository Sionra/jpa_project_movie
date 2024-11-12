package Deserializer.Attributs;

import Entities.LieuNaissance;
import Entities.Pays;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;

public class LieuNaissanceDeserializer extends JsonDeserializer<LieuNaissance> {

    @Override
    public LieuNaissance deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        String text = p.getText();

        if (text == null || text.trim().isEmpty()) {
            return null;
        }

        String[] parts = text.split(",\\s*");
        LieuNaissance lieu = new LieuNaissance();

        // Remplissage des attributs selon le nombre de parties dans la chaîne
        if (parts.length >= 1) {
            lieu.setVille(parts[0]); // Premier élément pour la ville
        }
        if (parts.length >= 2) {
            lieu.setState(parts[1]); // Deuxième élément pour l'état
        }
        if (parts.length >= 3) {
            lieu.setPays(parts[2]);
        }
        if (parts.length == 4) {
            lieu.setQuartier(parts[0]); // Premier élément pour le quartier si 4 parties
            lieu.setVille(parts[1]);
            lieu.setState(parts[2]);
            lieu.setPays(parts[3]);
        }

        return lieu;
    }
}