package Tests;

import Entities.Realisateur;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParserRealisateur {
    public static void main(String[] args) throws Exception {
        String jsonString = "{\"identite\":\"Aaron Horvath\",\"url\":\"/name/nm1739338/?ref_=tt_ov_dr\"}";

        ObjectMapper objectMapper = new ObjectMapper();

        Realisateur realisateur = objectMapper.readValue(jsonString, Realisateur.class);

        System.out.println("ID : " + realisateur.getId());
        System.out.println("URL : " + realisateur.getUrl());
        System.out.println("Identite : " + realisateur.getIdentite());
        System.out.println("Films : " + realisateur.getFilms());

    }
}
