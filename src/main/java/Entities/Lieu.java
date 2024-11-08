package Entities;

import java.util.List;

public class Lieu {
    int id;
    String ville;
    String state;
    Pays pays;
    List<Naissance> naissance;
    List<Film> film;

    public Lieu() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getState() {
        return state;
    }

    public void setState(String stat) {
        this.state = state;
    }

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }

    public List<Naissance> getNaissance() {
        return naissance;
    }

    public void setNaissance(List<Naissance> naissance) {
        this.naissance = naissance;
    }

    public List<Film> getFilm() {
        return film;
    }

    public void setFilm(List<Film> film) {
        this.film = film;
    }
}
