package bo;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="film")
public class Film implements Serializable {

    @Id
    private String id;
    @Column(name="NOM")
    private String nom;
    @Column(name="URL")
    private String url;
    @Column(name="PLOT")
    private String plot;
    @Column(name="LANGUE")
    private String langue;
    @ManyToMany
    @JoinTable(name="film_lieu",
            joinColumns = @JoinColumn(name="ID_FILM"),
            inverseJoinColumns = @JoinColumn(name="ID_LIEU",referencedColumnName = "ID"))
    private Set<Lieu> lieux;

    @ManyToMany
    @JoinTable(name="film_genre",
            joinColumns = @JoinColumn(name="ID_FILM"),
            inverseJoinColumns = @JoinColumn(name="ID_GENRE",referencedColumnName = "ID"))
    private Set<Genre> genres;

    @ManyToMany
    @JoinTable(name="film_real",
            joinColumns = @JoinColumn(name="ID_FILM"),
            inverseJoinColumns = @JoinColumn(name="ID_REAL",referencedColumnName = "ID"))
    private Set<Realisateur> reals;

    @ManyToMany
    @JoinTable(name="casting_principal",
            joinColumns = @JoinColumn(name="ID_FILM"),
            inverseJoinColumns = @JoinColumn(name="ID_REAL",referencedColumnName = "ID"))
    private Set<Acteur> acteurs;

    @OneToMany(mappedBy = "film",cascade = CascadeType.ALL)
    private Set<Role> roles;

    @ManyToOne
    @JoinColumn(name="PAYS_ID")
    private Pays pays;



    public Film (){}

    public Film(String id, String nom, String url, String plot, String langue, Set<Lieu> lieux, Set<Genre> genres, Set<Realisateur> reals, Set<Acteur> acteurs, Set<Role> roles, Pays pays) {
        this.id = id;
        this.nom = nom;
        this.url = url;
        this.plot = plot;
        this.langue = langue;
        this.lieux = lieux;
        this.genres = genres;
        this.reals = reals;
        this.acteurs = acteurs;
        this.roles = roles;
        this.pays = pays;
    }

    /**
     * Getter for id
     * return id
     */
    public String getId() {
        return id;
    }

    /**
     * Setter for id
     *
     * @param id to set
     */
    public void setId(String id) {
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

    /**
     * Getter for plot
     * return plot
     */
    public String getPlot() {
        return plot;
    }

    /**
     * Setter for plot
     *
     * @param plot to set
     */
    public void setPlot(String plot) {
        this.plot = plot;
    }

    /**
     * Getter for langue
     * return langue
     */
    public String getLangue() {
        return langue;
    }

    /**
     * Setter for langue
     *
     * @param langue to set
     */
    public void setLangue(String langue) {
        this.langue = langue;
    }

    /**
     * Getter for pays
     * return pays
     */
    public Pays getPays() {
        return pays;
    }

    /**
     * Setter for pays
     *
     * @param pays to set
     */
    public void setPays(Pays pays) {
        this.pays = pays;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Film{");
        sb.append("id='").append(id).append('\'');
        sb.append(", nom='").append(nom).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", plot='").append(plot).append('\'');
        sb.append(", langue='").append(langue).append('\'');
        sb.append(", lieux=").append(lieux);
        sb.append(", genres=").append(genres);
        sb.append(", reals=").append(reals);
        sb.append(", acteurs=").append(acteurs);
        sb.append(", roles=").append(roles);
        sb.append(", pays=").append(pays);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return Objects.equals(id, film.id) && Objects.equals(nom, film.nom) && Objects.equals(url, film.url) && Objects.equals(plot, film.plot) && Objects.equals(langue, film.langue) && Objects.equals(lieux, film.lieux) && Objects.equals(genres, film.genres) && Objects.equals(reals, film.reals) && Objects.equals(acteurs, film.acteurs) && Objects.equals(roles, film.roles) && Objects.equals(pays, film.pays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, url, plot, langue, lieux, genres, reals, acteurs, roles, pays);
    }
}

