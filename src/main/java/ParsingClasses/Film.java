package ParsingClasses;

import Deserializer.Attributs.ListGenresDeserializer;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Film {
    String id, nom, url, plot, langue;
    String anneeSortie;
    List<Realisateur> realisateurs;

    @JsonDeserialize(using = ListGenresDeserializer.class)
    List<Genre> genres;

    @JsonProperty("castingPrincipal")
    List<Acteur> acteurs;

    @JsonProperty("lieuTournage")
    Lieu lieu;

    Pays pays;
    List<Role> roles;

    public Film() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public List<Realisateur> getRealisateurs() {
        return realisateurs;
    }

    public void setRealisateurs(List<Realisateur> realisateurs) {
        this.realisateurs = realisateurs;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public Lieu getLieu() {
        return lieu;
    }

    public void setLieu(Lieu lieu) {
        this.lieu = lieu;
    }

    public List<Acteur> getActeurs() {
        return acteurs;
    }

    public void setActeurs(List<Acteur> acteurs) {
        this.acteurs = acteurs;
    }

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRole(List<Role> roles) {
        this.roles = roles;
    }

    public String getAnneeSortie() {
        return anneeSortie;
    }

    public void setAnneeSortie(String anneeSortie) {
        this.anneeSortie = anneeSortie;
    }
}
