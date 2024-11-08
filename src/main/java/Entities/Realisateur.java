package Entities;

import java.util.List;

public class Realisateur {
    int id;
    String identite, url;
    List<Film> films;

    public Realisateur(int id, String identite, String url, List<Film> films) {
        this.id = id;
        this.identite = identite;
        this.url = url;
        this.films = films;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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