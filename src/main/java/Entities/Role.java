package Entities;

import java.util.List;

public class Role {
    String nom_personnage;
    List<Acteur> acteurs;
    List<Role> roles;

    public Role(String nom_personnage, List<Acteur> acteurs, List<Role> roles) {
        this.nom_personnage = nom_personnage;
        this.acteurs = acteurs;
        this.roles = roles;
    }

    public String getNom_personnage() {
        return nom_personnage;
    }

    public void setNom_personnage(String nom_personnage) {
        this.nom_personnage = nom_personnage;
    }

    public List<Acteur> getActeurs() {
        return acteurs;
    }

    public void setActeurs(List<Acteur> acteurs) {
        this.acteurs = acteurs;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
