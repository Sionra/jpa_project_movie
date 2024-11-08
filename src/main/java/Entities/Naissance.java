package Entities;

import Deserializer.LieuDeserializer;
import Deserializer.LocalDateDeserializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDate;
import java.util.List;

public class Naissance {
    int id;

    @JsonProperty("dateNaissance")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    LocalDate dateNaissance;

    @JsonProperty("lieuNaissance")
    @JsonDeserialize(using = LieuDeserializer.class)
    Lieu lieu;

    List<Acteur> acteurs;

    public Naissance() {}

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

    public Lieu getLieu() {
        return lieu;
    }

    public void setLieu(Lieu lieu) {
        this.lieu = lieu;
    }

    public List<Acteur> getActeurs() {
        return acteurs;
    }

    public void setActeurs(List<Acteur> acteurs) {
        this.acteurs = acteurs;
    }
}
