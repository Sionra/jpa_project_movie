package bo;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="naissance")
public class Naissance implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="DATE_NAISSANCE")
    private LocalDate dateNaissance;
    @ManyToOne
    @JoinColumn(name="LIEU_ID")
    private Lieu lieu;
    @OneToMany(mappedBy ="naissance")
    private Set<Acteur> acteursBorn;

    public Naissance (){
    }

    public Naissance(LocalDate dateNaissance, Lieu lieu) {
        this.dateNaissance = dateNaissance;
        this.lieu = lieu;
    }

    /**
     * Getter for id
     * return id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter for id
     *
     * @param id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for dateNaissance
     * return dateNaissance
     */
    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    /**
     * Setter for dateNaissance
     *
     * @param dateNaissance to set
     */
    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    /**
     * Getter for lieu
     * return lieu
     */
    public Lieu getLieu() {
        return lieu;
    }

    /**
     * Setter for lieu
     *
     * @param lieu to set
     */
    public void setLieu(Lieu lieu) {
        this.lieu = lieu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Naissance naissance = (Naissance) o;
        return id == naissance.id && Objects.equals(dateNaissance, naissance.dateNaissance) && Objects.equals(lieu, naissance.lieu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateNaissance, lieu);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Naissance{");
        sb.append("id=").append(id);
        sb.append(", dateNaissance=").append(dateNaissance);
        sb.append(", lieu=").append(lieu);
        sb.append('}');
        return sb.toString();
    }
}
