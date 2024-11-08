package Entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Acteur {
    private String id;
    private String identite;
    private String url;
    double height;

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
}
