package entitys;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

/**
 * Classe représentant un film dans la base de données.
 * Cette classe est une entité JPA qui correspond à la table 'film'.
 * Chaque instance de cette classe représente un enregistrement de film
 * avec des informations telles que le nom, l'URL, le résumé (plot), la langue,
 * les réalisateurs associés, les genres, les acteurs, et les lieux.
 */
@Entity
@Table(name = "film")
public class Film implements Serializable {

    /**
     * Identifiant unique du film.
     * Généré automatiquement avec une stratégie d'identité.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    /**
     * Nom du film.
     */
    @Column(name = "NOM")
    private String nom;

    /**
     * URL associée au film (ex. lien vers une page web du film).
     */
    @Column(name = "URL")
    private String url;

    /**
     * Résumé ou synopsis du film.
     */
    @Column(name = "PLOT")
    private String plot;

    /**
     * Langue principale du film.
     */
    @Column(name = "LANGUE")
    private String langue;

    /**
     * Ensemble des réalisateurs ayant participé au film.
     * Relation plusieurs-à-plusieurs avec la table 'realisateur'.
     */
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "film_real",
            joinColumns = @JoinColumn(name = "ID_FILM", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "ID_REALISATEUR", referencedColumnName = "ID"))
    private Set<Realisateur> realisateurs;

    /**
     * Ensemble des genres associés au film.
     * Relation plusieurs-à-plusieurs avec la table 'genre'.
     */
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "film_genre",
            joinColumns = @JoinColumn(name = "ID_FILM", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "ID_GENRE", referencedColumnName = "ID"))
    private Set<Genre> genres;

    /**
     * Ensemble des acteurs principaux jouant dans le film.
     * Relation plusieurs-à-plusieurs avec la table 'acteur'.
     */
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "casting_principal",
            joinColumns = @JoinColumn(name = "ID_FILM", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "ID_ACTEUR", referencedColumnName = "ID"))
    private Set<Acteur> acteurs;

    /**
     * Ensemble des lieux associés au film.
     * Relation plusieurs-à-plusieurs avec la table 'lieu'.
     */
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "film_lieu",
            joinColumns = @JoinColumn(name = "ID_FILM", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "ID_LIEU", referencedColumnName = "ID"))
    private Set<Lieu> lieux;

    /**
     * Relation plusieurs-à-un avec un autre film (par exemple, un film lié).
     */
    @ManyToOne
    @JoinColumn(name = "ID_FILM")
    private Film films;

    /**
     * Constructeur par défaut.
     */
    public Film() {
    }

    // Getters et setters
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

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public Set<Genre> getGenres() {
        return genres;
    }

    public void setGenres(Set<Genre> genres) {
        this.genres = genres;
    }

    /**
     * Retourne les réalisateurs associés au film.
     *
     * @return ensemble de réalisateurs
     */
    public Set<Realisateur> getRealisateurs() {
        return realisateurs;
    }

    /**
     * Définit les réalisateurs associés au film.
     *
     * @param realisateurs ensemble de réalisateurs
     */
    public void setRealisateurs(Set<Realisateur> realisateurs) {
        this.realisateurs = realisateurs;
    }

    /**
     * Génère une représentation textuelle de l'objet Film.
     *
     * @return chaîne de caractères représentant le film
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Film{");
        sb.append("id=").append(id);
        sb.append(", nom='").append(nom).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", plot='").append(plot).append('\'');
        sb.append(", langue='").append(langue).append('\'');
        sb.append(", realisateurs=").append(realisateurs);
        sb.append('}');
        return sb.toString();
    }

    /**
     * Vérifie si deux objets Film sont égaux en comparant les attributs principaux.
     *
     * @param o l'objet à comparer
     * @return true si les objets sont égaux, false sinon
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return id == film.id && Objects.equals(nom, film.nom) && Objects.equals(url, film.url) && Objects.equals(plot, film.plot) && Objects.equals(langue, film.langue) && Objects.equals(realisateurs, film.realisateurs);
    }

    /**
     * Calcule le hash code de l'objet Film en fonction de ses attributs principaux.
     *
     * @return le hash code de l'objet Film
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, nom, url, plot, langue, realisateurs);
    }
}
