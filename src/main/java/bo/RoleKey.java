package bo;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RoleKey implements Serializable {
    @Column(name="ACTEUR_ID")
    private String acteurId;
    @Column(name="FILM_ID")
    private String filmId;

    public RoleKey(String acteurId, String filmId) {
        this.acteurId = acteurId;
        this.filmId = filmId;
    }

    /**
     * Getter for acteurId
     * return acteurId
     */
    public String getActeurId() {
        return acteurId;
    }

    /**
     * Setter for acteurId
     *
     * @param acteurId to set
     */
    public void setActeurId(String acteurId) {
        this.acteurId = acteurId;
    }

    /**
     * Getter for filmId
     * return filmId
     */
    public String getFilmId() {
        return filmId;
    }

    /**
     * Setter for filmId
     *
     * @param filmId to set
     */
    public void setFilmId(String filmId) {
        this.filmId = filmId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleKey roleKey = (RoleKey) o;
        return Objects.equals(acteurId, roleKey.acteurId) && Objects.equals(filmId, roleKey.filmId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(acteurId, filmId);
    }
}
