package Entities;

import java.util.List;

public class Genre {
    String nom;
    List<Film> films;

    public Genre(String nom, List<Film> films) {
        this.nom = nom;
        this.films = films;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }
}
