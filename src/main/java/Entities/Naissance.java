package Entities;

import java.time.LocalDate;
import java.util.List;

public class Naissance {
    int id;
    LocalDate dateNaissance;
    List<Lieu> lieux;
    List<Acteur> acteurs;

    public Naissance(int id, LocalDate dateNaissance, List<Lieu> lieux, List<Acteur> acteurs) {
        this.id = id;
        this.dateNaissance = dateNaissance;
        this.lieux = lieux;
        this.acteurs = acteurs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
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
}
