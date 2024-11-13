// PAYS : PARSED
// LISTES A FIX

package ParsingClasses;

import Deserializer.Classes.PaysDeserializer;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

@JsonDeserialize(using = PaysDeserializer.class)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "nom")
public class Pays {
    String nom;
    String url;
    List<Film> films;
    List<Lieu> lieux;

    public Pays() {}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public List<Lieu> getLieux() {
        return lieux;
    }

    public void setLieux(List<Lieu> lieux) {
        this.lieux = lieux;
    }
}

