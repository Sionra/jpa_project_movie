package Deserializer;
import Entities.Lieu;

import Entities.Pays;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;

public class LieuDeserializer extends JsonDeserializer<Lieu> {
    @Override
    public Lieu deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        String text = p.getText();

        String[] parts = text.split(",\\s*");
        Lieu lieu = new Lieu();

        if (parts.length == 4) {
            lieu.setQuartier(parts[0]);
            lieu.setVille(parts[1]);
            lieu.setState(parts[2]);
            Pays pays = new Pays();
            pays.setNom(parts[3]);
            lieu.setPays(pays);
        } else {
            // Si 3 éléments ou moins, le premier est la ville, le deuxième est l'état, le troisième est le pays
            if (parts.length > 0) lieu.setVille(parts[0]);
            if (parts.length > 1) lieu.setState(parts[1]);
            if (parts.length > 2) {
                Pays pays = new Pays();
                pays.setNom(parts[2]);
                lieu.setPays(pays);
            }
        }
        return lieu;
    }
}
