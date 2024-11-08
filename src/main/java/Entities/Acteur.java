package Entities;

public class Acteur {
    private String id;
    private String identité;
    private String url;
    double poids;

    public Acteur(String id, String identité, String url, double poids) {
        this.id = id;
        this.identité = identité;
        this.url = url;
        this.poids = poids;
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
}
