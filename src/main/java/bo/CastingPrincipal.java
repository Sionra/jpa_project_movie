package bo;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class CastingPrincipal implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;
    @ManyToOne
    @JoinColumn(name="ID_ACTEUR")
    private Acteur acteur;

    @ManyToOne
    @JoinColumn(name="ID_FILM")
    private Film film;

    public CastingPrincipal(){

    }

    /**
     * Getter for acteur
     * return acteur
     */
    public Acteur getActeur() {
        return acteur;
    }

    /**
     * Setter for acteur
     *
     * @param acteur to set
     */
    public void setActeur(Acteur acteur) {
        this.acteur = acteur;
    }

    /**
     * Getter for film
     * return film
     */
    public Film getFilm() {
        return film;
    }

    /**
     * Setter for film
     *
     * @param film to set
     */
    public void setFilm(Film film) {
        this.film = film;
    }
}
