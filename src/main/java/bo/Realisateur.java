package bo;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="realisateur")
public class Realisateur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="IDENTITE")
    private String identite;
    @Column(name="URL")
    private String url;
    @ManyToMany(mappedBy="reals")
    private Set<Film> films;

    public Realisateur (){}

    public Realisateur(String identite, String url) {
        this.identite = identite;
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
     * Getter for identité
     * return identité
     */
    public String getIdentite() {
        return identite;
    }

    /**
     * Setter for identité
     *
     * @param identite to set
     */
    public void setIdentite(String identite) {
        this.identite = identite;
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
        Realisateur that = (Realisateur) o;
        return id == that.id && Objects.equals(identite, that.identite) && Objects.equals(url, that.url) && Objects.equals(films, that.films);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, identite, url, films);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Realisateur{");
        sb.append("id=").append(id);
        sb.append(", identité='").append(identite).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", films=").append(films);
        sb.append('}');
        return sb.toString();
    }
}
