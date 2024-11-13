package Tests.parsing;

import ParsingClasses.Realisateur;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParserRealisateur {
    public static void main(String[] args) throws Exception {
        String jsonString = "{\"identite\":\"Aaron Horvath\",\"url\":\"/name/nm1739338/?ref_=tt_ov_dr\"}";
        String jsonString2 = "{\"identite\":\"Aaron Horvath\",\"url\":\"/name/nm1739338/?ref_=tt_ov_dr\"}";

        ObjectMapper objectMapper = new ObjectMapper();

        Realisateur realisateur = objectMapper.readValue(jsonString, Realisateur.class);
        Realisateur realisateur2 = objectMapper.readValue(jsonString2, Realisateur.class);

        System.out.println("URL : " + realisateur.getUrl());
        System.out.println("Identite : " + realisateur.getIdentite());
        System.out.println("Films : " + realisateur.getFilms());
        System.out.println("\nPas de doublon : " + (realisateur == realisateur2));
    }
}
