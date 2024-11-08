package main.Entities;

public class Lieu {
    int id;
    String ville;
    String stat;
    String pays;

    public Lieu(int id, String ville, String stat, String pays) {
        this.id = id;
        this.ville = ville;
        this.stat = stat;
        this.pays = pays;
    }

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

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}
