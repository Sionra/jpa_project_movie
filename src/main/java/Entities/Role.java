package Entities;

public class Role {
    String nom_personnage;

    public Role(String nom_personnage) {
        this.nom_personnage = nom_personnage;
    }

    public String getNom_personnage() {
        return nom_personnage;
    }

    public void setNom_personnage(String nom_personnage) {
        this.nom_personnage = nom_personnage;
    }
}
