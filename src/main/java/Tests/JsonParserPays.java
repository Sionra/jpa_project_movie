package Tests;

import Entities.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class JsonParserPays {
    public static void main(String[] args) throws Exception {
        String jsonString = "{ \"nom\": \"United States\", \"url\": \"/search/title/?country_of_origin=US&ref_=tt_dt_cn\" }";

        ObjectMapper objectMapper = new ObjectMapper();

        Pays pays = objectMapper.readValue(jsonString, Pays.class);

        System.out.println("ID du pays : " + pays.getNom());
        System.out.println("Nom du pays : " + pays.getNom());
        System.out.println("URL : " + pays.getUrl());
    }
}