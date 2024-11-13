package ParsingClasses;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Role {
    private static int idCounter = 0;
    Integer id;

    @JsonProperty("characterName")
    String nom_personnage;

    @JsonProperty("acteur")
    Acteur acteur;

    @JsonProperty("film")
    String filmId;

    public Role() {
        this.id = ++idCounter;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom_personnage() {
        return nom_personnage;
    }

    public void setNom_personnage(String nom_personnage) {
        this.nom_personnage = nom_personnage;
    }

    public Acteur getActeur() {
        return acteur;
    }

    public void setActeur(Acteur acteur) {
        this.acteur = acteur;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Role.idCounter = idCounter;
    }

    public String getFilmId() {
        return filmId;
    }

    public void setFilmId(String filmId) {
        this.filmId = filmId;
    }
}
