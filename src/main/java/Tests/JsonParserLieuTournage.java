package Tests;

import Entities.LieuTournage;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParserLieuTournage {
    public static void main(String[] args) throws Exception {
        String jsonString = "{\"ville\":\"\",\"etatDept\":\"Paris\",\"pays\":\" France\"}";

        ObjectMapper mapper = new ObjectMapper();

        LieuTournage lieu = mapper.readValue(jsonString, LieuTournage.class);

        System.out.println("Ville : " + lieu.getVille());
        System.out.println("EtatDept : " + lieu.getEtatDept());
        System.out.println("Pays : " + lieu.getPays());



    }
}
