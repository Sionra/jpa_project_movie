// NAISSANCE : PARSED

package Entities;

import Deserializer.Attributs.LieuAttributsDeserializer;
import Deserializer.Attributs.LocalDateDeserializer;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDate;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Naissance {
    int id;

    @JsonProperty("dateNaissance")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    LocalDate dateNaissance;

    @JsonProperty("lieuNaissance")
    @JsonDeserialize(using = LieuAttributsDeserializer.class)
    Lieu lieu;

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
}
