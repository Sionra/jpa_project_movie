package Deserializer.Attributs;

import ParsingClasses.Genre;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListGenresDeserializer extends JsonDeserializer<List<Genre>> {
    @Override
    public List<Genre> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        JsonNode node = p.getCodec().readTree(p);
        List<Genre> genres = new ArrayList<>();

        for (JsonNode genreNode : node) {
            String genreName = genreNode.asText();
            genres.add(new Genre(genreName));       
        }

        return genres;
    }
}