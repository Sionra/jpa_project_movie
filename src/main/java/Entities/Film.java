package Entities;

import java.util.List;

public class Film {
    String id, nom, url, plot, langue;
    List<Realisateur> realisateurs;
    List<Genre> genres;
    List<Lieu> lieux;
    List<Acteur> acteurs;
    Pays pays;

    public Film(String id, String nom, String url, String plot, String langue, List<Realisateur> realisateurs, List<Genre> genres, List<Lieu> lieux, List<Acteur> acteurs, Pays pays) {
        this.id = id;
        this.nom = nom;
        this.url = url;
        this.plot = plot;
        this.langue = langue;
        this.realisateurs = realisateurs;
        this.lieux = lieux;
        this.acteurs = acteurs;
        this.genres = genres;
        this.pays = pays;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public List<Realisateur> getRealisateurs() {
        return realisateurs;
    }

    public void setRealisateurs(List<Realisateur> realisateurs) {
        this.realisateurs = realisateurs;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public List<Lieu> getLieux() {
        return lieux;
    }

    public void setLieux(List<Lieu> lieux) {
        this.lieux = lieux;
    }

    public List<Acteur> getActeurs() {
        return acteurs;
    }

    public void setActeurs(List<Acteur> acteurs) {
        this.acteurs = acteurs;
    }

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }
}
