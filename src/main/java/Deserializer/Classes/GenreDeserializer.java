package Deserializer.Classes;
import Entities.Genre;

public class GenreDeserializer extends UniversalDeserializer<Genre> {
    public GenreDeserializer() {
        super(Genre.class);
    }
}