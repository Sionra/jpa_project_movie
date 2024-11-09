package Entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.util.List;
import java.util.UUID;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Role {
    String id;
    String nom_personnage;
    List<Acteur> acteurs;

    public Role() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}
