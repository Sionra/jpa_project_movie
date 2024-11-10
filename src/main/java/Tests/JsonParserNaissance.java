// TEST AUSSI LIEU NAISSANCE

package Tests;

import Entities.Naissance;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParserNaissance {
    public static void main(String[] args) throws JsonProcessingException {
        String jsonString1 = "{\"dateNaissance\": \"1982-7-18\", \"lieuNaissance\": \"Jamshedpur, Bihar, India\"}";

        ObjectMapper objectMapper = new ObjectMapper();

        Naissance naissance1 = objectMapper.readValue(jsonString1, Naissance.class);

        System.out.println("ID de naissance : " + naissance1.getId());
        System.out.println("Date de naissance : " + naissance1.getDateNaissance());
        System.out.println("Ville de naissance : " + naissance1.getLieu().getVille());
        System.out.println("Région/Etat de naissance : " + naissance1.getLieu().getState());
        System.out.println("Pays de naissance : " + naissance1.getLieu().getPays());

        String jsonString2 = "{\"dateNaissance\": \"1964-10-25\", \"lieuNaissance\": \"Bronx, New York City, New York, USA\"}";

        Naissance naissance2 = objectMapper.readValue(jsonString2, Naissance.class);

        System.out.println("\nID de naissance : " + naissance2.getId());
        System.out.println("Date de naissance : " + naissance2.getDateNaissance());
        System.out.println("Quartier de naissance : " + naissance2.getLieu().getQuartier());
        System.out.println("Ville de naissance : " + naissance2.getLieu().getVille());
        System.out.println("Région/Etat de naissance : " + naissance2.getLieu().getState());
        System.out.println("Pays de naissance : " + naissance2.getLieu().getPays());

        System.out.println("\nAbsence de doublons : " + (naissance1 != naissance2));
    }
}
