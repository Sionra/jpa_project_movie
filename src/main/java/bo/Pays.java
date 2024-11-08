package bo;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="pays")
public class Pays implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="NOM")
    private String nom;
    @Column(name="URL")
    private String url;
    @OneToMany(mappedBy = "pays")
    private Set<Film> films;
    @OneToMany(mappedBy="pays")
    private Set<Lieu> lieux;

    public Pays(){
    }

    public Pays(String nom, String url) {
        this.nom = nom;
        this.url = url;
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
     * Getter for nom
     * return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter for nom
     *
     * @param nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter for url
     * return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Setter for url
     *
     * @param url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pays pays = (Pays) o;
        return id == pays.id && Objects.equals(nom, pays.nom) && Objects.equals(url, pays.url) && Objects.equals(films, pays.films) && Objects.equals(lieux, pays.lieux);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, url, films, lieux);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pays{");
        sb.append("id=").append(id);
        sb.append(", nom='").append(nom).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", films=").append(films);
        sb.append(", lieux=").append(lieux);
        sb.append('}');
        return sb.toString();
    }
}
