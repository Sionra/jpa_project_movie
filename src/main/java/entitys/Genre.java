package entitys;

import jakarta.persistence.*;
import org.checkerframework.checker.units.qual.C;

import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "genre")
public class Genre {

    @Id
    @Column(name = "NOM")
    private String nom;

    @ManyToMany(mappedBy = "genre")
    private Set<Film> films;

    public Genre() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Set<Film> getFilms() {
        return films;
    }

    public void setFilms(Set<Film> films) {
        this.films = films;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Genre genre = (Genre) o;
        return Objects.equals(nom, genre.nom) && Objects.equals(films, genre.films);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, films);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Genre{");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", films=").append(films);
        sb.append('}');
        return sb.toString();
    }
}
