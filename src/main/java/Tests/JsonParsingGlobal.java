package Tests;

import Entities.Film;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class JsonParsingGlobal {
    public static void main(String[] args) throws IOException {
        ObjectMapper objMapper = new ObjectMapper();
        String patate = Paths.get("src/main/resources/films.json").toAbsolutePath().toString();

        Film[] films = objMapper.readValue(new File(patate), Film[].class);

        System.out.println("Nombre de film : " + films.length);

    }
}
