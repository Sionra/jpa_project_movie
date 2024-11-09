package Tests;

import Entities.*;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParserGenre {
    public static void main(String[] args) throws Exception {
        String jsonString = "{\"genres\": [\"Action\", \"Adventure\", \"Comedy\"]}";

        ObjectMapper objectMapper = new ObjectMapper();

        Genre genres = objectMapper.readValue(jsonString, Genre.class);

        for(int i=0; i<genres.getNoms().size(); i++){
            System.out.println("Genre " + (i+1) + " : " + genres.getNoms().get(i));
        }
    }
}
