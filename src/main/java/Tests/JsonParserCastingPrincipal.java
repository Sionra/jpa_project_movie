package Tests;

import Deserializer.Classes.ActeurDeserializer;
import Entities.Acteur;
import Entities.CastingPrincipal;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class JsonParserCastingPrincipal {
    public static void main(String[] args) throws Exception {
        String jsonString = "{ \"castingPrincipal\": [ { " +
                "\"id\": \"nm1231899\", " +
                "\"identite\": \"Priyanka Chopra Jonas\", " +
                "\"naissance\": { " +
                "\"dateNaissance\": \"1982-7-18\", " +
                "\"lieuNaissance\": \"Jamshedpur, Bihar, India\" " +
                "}, " +
                "\"url\": \"/name/nm1231899/?ref_=tt_ov_st\", " +
                "\"height\": null, " +
                "\"roles\": [] " +
                "}, { " +
                "\"id\": \"nm1231899\", " +
                "\"identite\": \"Priyanka Chopra Jonas\", " +
                "\"naissance\": { " +
                "\"dateNaissance\": \"1982-7-18\", " +
                "\"lieuNaissance\": \"Jamshedpur, Bihar, India\" " +
                "}, " +
                "\"url\": \"/name/nm1231899/?ref_=tt_ov_st\", " +
                "\"height\": null, " +
                "\"roles\": [] " +
                "} ] }";

        ObjectMapper objectMapper = new ObjectMapper();

//        SimpleModule module = new SimpleModule();
//        module.addDeserializer(Acteur.class, new ActeurDeserializer());
//        objectMapper.registerModule(module);

        CastingPrincipal castingPrincipal = objectMapper.readValue(jsonString, CastingPrincipal.class);

        System.out.println("CASTING PRINCIPAL");
        for(Acteur acteur : castingPrincipal.getActeurs()){
            System.out.println("Nom de l'acteur : " + acteur.getIdentite());
        }

    }
}
