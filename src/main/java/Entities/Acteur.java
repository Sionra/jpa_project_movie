// ACTEUR : PARSED (SAUF FILMS)

package Entities;

import Deserializer.Classes.ActeurDeserializer;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

@JsonDeserialize(using = ActeurDeserializer.class)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
                    property = "id"
                )
public class Acteur {
    private String id;
    private String identite;
    private String url;
    double height;
    List<Role> roles;

    Naissance naissance;

    List<Film> films;

    public Acteur() {}

    public String getId() {
        return id;
    }

    public String getIdentite() {
        return identite;
    }

    public String getUrl() {
        return url;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIdentite(String identité) {
        this.identite = identité;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Naissance getNaissance() {
        return naissance;
    }

    public void setNaissance(Naissance naissance) {
        this.naissance = naissance;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRole(List<Role> roles) {
        this.roles = roles;
    }
}
