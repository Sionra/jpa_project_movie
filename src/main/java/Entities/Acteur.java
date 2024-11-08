package Entities;

import java.util.List;

public class Acteur {
    private String id;
    private String identité;
    private String url;
    double poids;
    Naissance naissance;
    List<Film> films;

    public Acteur(String id, String identité, String url, double poids, Naissance naissance, List<Film> films) {
        this.id = id;
        this.identité = identité;
        this.url = url;
        this.poids = poids;
        this.naissance = naissance;
        this.films = films;
    }

    public String getId() {
        return id;
    }

    public String getIdentité() {
        return identité;
    }

    public String getUrl() {
        return url;
    }

    public double getPoids() {
        return poids;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIdentité(String identité) {
        this.identité = identité;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setPoids(double poids) {
        this.poids = poids;
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
}
