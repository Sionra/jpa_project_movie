package bo;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Role implements Serializable {

    @EmbeddedId
    private RoleKey id;

    @ManyToOne
    @MapsId("acteurId")
    @JoinColumn(name="ACTEUR_ID")
    private Acteur acteur;

    @ManyToOne
    @MapsId("filmId")
    @JoinColumn(name="FILM_ID")
    private Film film;

    private String nomPersonnage;

    public Role() {
    }

    public Role(String nomPersonnage) {
        this.nomPersonnage = nomPersonnage;
    }

    /**
     * Getter for id
     * return id
     */
    public RoleKey getId() {
        return id;
    }

    /**
     * Setter for id
     *
     * @param id to set
     */
    public void setId(RoleKey id) {
        this.id = id;
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

    /**
     * Getter for nomPersonnage
     * return nomPersonnage
     */
    public String getNomPersonnage() {
        return nomPersonnage;
    }

    /**
     * Setter for nomPersonnage
     *
     * @param nomPersonnage to set
     */
    public void setNomPersonnage(String nomPersonnage) {
        this.nomPersonnage = nomPersonnage;
    }
}
