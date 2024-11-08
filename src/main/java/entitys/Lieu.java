package entitys;

import jakarta.persistence.*;
import org.checkerframework.checker.units.qual.N;

import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "lieu")
public class Lieu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "VILLE")
    private String ville;
    @Column(name = "ETAT")
    private String etat;
    @Column(name = "PAYS")
    private String pays;

    @OneToMany(mappedBy = "lieu", cascade = CascadeType.ALL)
    private Set<Naissance> naissances;

    @ManyToOne
    @JoinColumn(name = "ID_PAYS")
    private Pays pays_id;

    @ManyToMany(mappedBy = "lieu")
    private Set<Film> films;

    public Lieu() {
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

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Lieu{");
        sb.append("id=").append(id);
        sb.append(", ville='").append(ville).append('\'');
        sb.append(", etat='").append(etat).append('\'');
        sb.append(", pays='").append(pays).append('\'');
        sb.append(", naissances=").append(naissances);
        sb.append(", pays_id=").append(pays_id);
        sb.append(", films=").append(films);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lieu lieu = (Lieu) o;
        return id == lieu.id && Objects.equals(ville, lieu.ville) && Objects.equals(etat, lieu.etat) && Objects.equals(pays, lieu.pays) && Objects.equals(naissances, lieu.naissances) && Objects.equals(pays_id, lieu.pays_id) && Objects.equals(films, lieu.films);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ville, etat, pays, naissances, pays_id, films);
    }
}
