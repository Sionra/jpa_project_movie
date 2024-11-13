package Entities;

import Deserializer.Classes.GenreDeserializer;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="genre")
@JsonDeserialize(using = GenreDeserializer.class)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "genres")
public class GenreE implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;

    @Column(name="NOM")
    @JsonProperty("genres")
    private String nom;

//    @ManyToMany(mappedBy="genres")
//    private Set<Film>films;
//
//    {
//        films = new HashSet<Film>();
//    }


    public GenreE(){}

    public GenreE(String nom) {
        this.nom = nom;
    }

    /**
     * Getter for id
     * return id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter for id
     *
     * @param id to set
     */
    public void setId(int id) {
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

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Genre genre = (Genre) o;
//        return id == genre.id && Objects.equals(nom, genre.nom) && Objects.equals(films, genre.films);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, nom, films);
//    }
//
//    @Override
//    public String toString() {
//        final StringBuffer sb = new StringBuffer("Genre{");
//        sb.append("id=").append(id);
//        sb.append(", nom='").append(nom).append('\'');
//        sb.append(", films=").append(films);
//        sb.append('}');
//        return sb.toString();
//    }
}
