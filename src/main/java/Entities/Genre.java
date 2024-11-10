// GENRE : PARSED (SAUF FILMS)

package Entities;

import Deserializer.Classes.GenreDeserializer;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;
import java.util.UUID;

@JsonDeserialize(using = GenreDeserializer.class)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Genre {
    @JsonProperty("id")
    String nom;

    List<Film> films;

    public Genre() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String noms) {
        this.nom = nom;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }
}
