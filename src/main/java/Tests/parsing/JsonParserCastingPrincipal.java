package Tests.parsing;

import ParsingClasses.Acteur;
import ParsingClasses.CastingPrincipal;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

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

        CastingPrincipal castingPrincipal = objectMapper.readValue(jsonString, CastingPrincipal.class);

        List<Acteur> casting = castingPrincipal.getActeurs();

        System.out.println("CASTING PRINCIPAL");
        for(Acteur acteur : casting){
            System.out.println("Nom de l'acteur : " + acteur.getIdentite());
        }

        // Vérifie que c'est la même instance à l'index 0 et l'index 1
        // plutôt qu'une instance à l'index 0 et son doublon à l'index 1
        System.out.println(casting.get(0) == casting.get(1));

    }
}
