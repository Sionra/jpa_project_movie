package Entities;

public class Realisteur {
    int id;
    String identite, url;

    public Realisteur(int id, String identite, String url) {
        this.id = id;
        this.identite = identite;
        this.url = url;
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
}
