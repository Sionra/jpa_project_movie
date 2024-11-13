// OK SAUF FILMS ET LIEUX

package Entities;

import Deserializer.Classes.PaysEDeserializer;
import Deserializer.Classes.RealisateurDeserializer;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="paysE")
@JsonDeserialize(using = PaysEDeserializer.class)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "nom")
public class PaysE implements Serializable {
    @Id
    @Column(name="NOM")
    private String nom;

    @Column(name="URL")
    private String url;

//    @OneToMany(mappedBy = "pays")
//    private Set<Film> films;
//    @OneToMany(mappedBy="pays")
//    private Set<Lieu> lieux;

    {
//        films = new HashSet<Film>();
//        lieux = new HashSet<Lieu>();
    }

    public PaysE(){
    }

    public PaysE(String nom, String url) {
        this.nom = nom;
        this.url = url;
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

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Pays pays = (Pays) o;
//        return id == pays.id && Objects.equals(nom, pays.nom) && Objects.equals(url, pays.url) && Objects.equals(films, pays.films) && Objects.equals(lieux, pays.lieux);
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id, nom, url, films, lieux);
//    }
//
//    @Override
//    public String toString() {
//        final StringBuffer sb = new StringBuffer("Pays{");
//        sb.append("id=").append(id);
//        sb.append(", nom='").append(nom).append('\'');
//        sb.append(", url='").append(url).append('\'');
//        sb.append(", films=").append(films);
//        sb.append(", lieux=").append(lieux);
//        sb.append('}');
//        return sb.toString();
//    }
}
