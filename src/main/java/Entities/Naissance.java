package Entities;

import java.time.LocalDate;

public class Naissance {
    int id;
    LocalDate dateNaissance;

    public Naissance(int id, LocalDate dateNaissance) {
        this.id = id;
        this.dateNaissance = dateNaissance;
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
}
