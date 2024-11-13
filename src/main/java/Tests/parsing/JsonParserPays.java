package Tests.parsing;

import ParsingClasses.*;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParserPays {
    public static void main(String[] args) throws Exception {
        String jsonString = "{ \"nom\": \"United States\", \"url\": \"/search/title/?country_of_origin=US&ref_=tt_dt_cn\" },";
        String jsonString2 = "{ \"nom\": \"United States\", \"url\": \"/search/title/?country_of_origin=US&ref_=tt_dt_cn\" }";

        ObjectMapper objectMapper = new ObjectMapper();

        Pays pays = objectMapper.readValue(jsonString, Pays.class);
        Pays pays2 = objectMapper.readValue(jsonString2, Pays.class);

        System.out.println("Nom du pays : " + pays.getNom());
        System.out.println("URL : " + pays.getUrl());

        System.out.println("Pas de doublon : " + (pays == pays2));
    }
}