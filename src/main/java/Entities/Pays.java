package Entities;

public class Pays {
    int id;
    String nom;
    String url;

    public Pays(int id, String nom, String url) {
        this.id = id;
        this.nom = nom;
        this.url = url;
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
}

