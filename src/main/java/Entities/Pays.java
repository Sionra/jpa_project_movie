package Entities;

import java.util.List;

public class Pays {
    int id;
    String nom;
    String url;
    List<Film> films;
    List<Lieu> lieux;

    public Pays(int id, String nom, String url, List<Film> films, List<Lieu> lieux) {
        this.id = id;
        this.nom = nom;
        this.url = url;
        this.films = films;
        this.lieux = lieux;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

