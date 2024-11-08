package entitys;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "pays")
public class Pays implements Serializable {

    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "NOM")
    private String nom;
    @Column(name = "URL")
    private String url;

    @OneToMany(mappedBy = "pays", cascade = CascadeType.ALL)
    private Set<Lieu> lieux;

    @OneToMany(mappedBy = "pays", cascade = CascadeType.ALL)
    private Set<Film> films;

    public Pays() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pays{");
        sb.append("id=").append(id);
        sb.append(", nom='").append(nom).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", lieux=").append(lieux);
        sb.append(", films=").append(films);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pays pays = (Pays) o;
        return id == pays.id && Objects.equals(nom, pays.nom) && Objects.equals(url, pays.url) && Objects.equals(lieux, pays.lieux) && Objects.equals(films, pays.films);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, url, lieux, films);
    }
}
