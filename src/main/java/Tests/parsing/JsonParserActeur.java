package Tests.parsing;

// ACTEUR : PARSED

import ParsingClasses.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class JsonParserActeur {
    public static void main(String[] args) throws Exception {
        String jsonString = "{"
                + "\"id\": \"nm0695435\","
                + "\"identite\": \"Chris Pratt\","
                + "\"naissance\": {"
                + "    \"dateNaissance\": \"1979-6-21\","
                + "    \"lieuNaissance\": \"Virginia, Minnesota, USA\""
                + "}"
                + "}";

        String jsonString2 = "{"
                + "\"id\": \"nm0695435\","
                + "\"identite\": \"Chris Pratt\","
                + "\"naissance\": {"
                + "    \"dateNaissance\": \"1979-6-21\","
                + "    \"lieuNaissance\": \"Virginia, Minnesota, USA\""
                + "}"
                + "}";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        Acteur actor = objectMapper.readValue(jsonString, Acteur.class);
        Acteur actor2 = objectMapper.readValue(jsonString2, Acteur.class);

        System.out.println("Nom de l'acteur : " + actor.getIdentite());
        System.out.println("Date de naissance : " + actor.getNaissance().getDateNaissance());
        System.out.println("Ville de naissance : " + actor.getNaissance().getLieu().getVille());
        System.out.println("Absence de doublon :" + (actor == actor2));
    }
}