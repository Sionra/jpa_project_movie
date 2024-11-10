package Tests;

import Entities.LieuNaissance;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParserLieuNaissance {
    public static void main(String[] args) throws JsonProcessingException {
        String jsonString = "{\"lieuNaissance\": \"Málaga, Andalucía, Spain\"}";

        ObjectMapper objectMapper = new ObjectMapper();

        LieuNaissance lieuNaissance1 = objectMapper.readValue(jsonString, LieuNaissance.class);

        System.out.println("LIEU NAISSANCE 1");
        System.out.println("Ville : " + lieuNaissance1.getVille());
    }
}
