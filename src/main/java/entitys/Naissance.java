package entitys;

import jakarta.persistence.*;
import org.checkerframework.checker.units.qual.C;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name ="naissance")
public class Naissance implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "DATE_NAISSANCE")
    private LocalDate dateNaissance;

    @ManyToMany(mappedBy = "naissance")
    private Set<Acteur> acteurs;

    @ManyToOne
    @JoinColumn(name = "ID_NAISSANCE")
    private Lieu lieu;

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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Naissance{");
        sb.append("id=").append(id);
        sb.append(", dateNaissance=").append(dateNaissance);
        sb.append(", acteurs=").append(acteurs);
        sb.append(", lieu=").append(lieu);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Naissance naissance = (Naissance) o;
        return id == naissance.id && Objects.equals(dateNaissance, naissance.dateNaissance) && Objects.equals(acteurs, naissance.acteurs) && Objects.equals(lieu, naissance.lieu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateNaissance, acteurs, lieu);
    }
}

