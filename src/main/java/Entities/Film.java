package Entities;

public class Film {
    String id, nom, url, plot, langue;

    public Film(String id, String nom, String url, String plot, String langue) {
        this.id = id;
        this.nom = nom;
        this.url = url;
        this.plot = plot;
        this.langue = langue;
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
}
