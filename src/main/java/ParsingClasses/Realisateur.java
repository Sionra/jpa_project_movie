// PARSED
// LISTE FILMS A FIX

package ParsingClasses;

import Deserializer.Classes.RealisateurDeserializer;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

@JsonDeserialize(using = RealisateurDeserializer.class)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "identite")
public class Realisateur {
    String identite;
    String url;
    List<Film> films;

    public Realisateur() {
    }

    public String getIdentite() {
        return identite;
    }

    public void setIdentite(String identite) {
        this.identite = identite;
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
}
