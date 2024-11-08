package entitys;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "realisateur")
public class Realisateur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "INDENTITE")
    private String indentite;
    @Column(name = "URL")
    private String url;

    @ManyToMany(mappedBy = "realisateurs")
    private Set<Film> films;

    public Realisateur() {

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

    public Set<Film> getFilms() {
        return films;
    }

    public void setFilms(Set<Film> films) {
        this.films = films;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Realisateur{");
        sb.append("id=").append(id);
        sb.append(", indentite='").append(indentite).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", films=").append(films);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Realisateur that = (Realisateur) o;
        return id == that.id && Objects.equals(indentite, that.indentite) && Objects.equals(url, that.url) && Objects.equals(films, that.films);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, indentite, url, films);
    }
}
