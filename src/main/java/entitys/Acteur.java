package entitys;

import jakarta.persistence.*;
import org.checkerframework.checker.units.qual.C;

import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "acteur")
public class Acteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "INDENTITE")
    private String indentite;
    @Column(name = "URL")
    private String url;
    @Column(name = "POIDS")
    private String poids;

    @ManyToMany(mappedBy = "acteur")
    private Set<Film> films;

    @OneToMany(mappedBy = "acteur", cascade = CascadeType.ALL)
    private Set<Naissance> naissances;

    public Acteur() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIndentite() {
        return indentite;
    }

    public void setIndentite(String indentite) {
        this.indentite = indentite;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPoids() {
        return poids;
    }

    public void setPoids(String poids) {
        this.poids = poids;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Acteur{");
        sb.append("id=").append(id);
        sb.append(", indentite='").append(indentite).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", poids='").append(poids).append('\'');
        sb.append(", films=").append(films);
        sb.append(", naissances=").append(naissances);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Acteur acteur = (Acteur) o;
        return id == acteur.id && Objects.equals(indentite, acteur.indentite) && Objects.equals(url, acteur.url) && Objects.equals(poids, acteur.poids) && Objects.equals(films, acteur.films) && Objects.equals(naissances, acteur.naissances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, indentite, url, poids, films, naissances);
    }
}
