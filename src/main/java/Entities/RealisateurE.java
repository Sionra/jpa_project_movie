package Entities;

import Deserializer.Classes.RealisateurDeserializer;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name="realisateurE")
@JsonDeserialize(using = RealisateurDeserializer.class)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "identite")
public class RealisateurE implements Serializable {
    @Id
    @Column(name="IDENTITE")
    private String identite;

    @Column(name="URL")
    private String url;

    //    @ManyToMany(mappedBy="reals")
    //    private Set<Film> films;

    //    {
    //        films = new HashSet<Film>();
    //    }


    public RealisateurE (){}

    public RealisateurE(String identite, String url) {
        this.identite = identite;
        this.url = url;
    }

    /**
     * Getter for identité (id)
     * return identité
     */
    public String getIdentite() {
        return identite;
    }

    /**
     * Setter for identité
     *
     * @param identite to set
     */
    public void setIdentite(String identite) {
        this.identite = identite;
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
    //        Realisateur that = (Realisateur) o;
    //        return id == that.id && Objects.equals(identite, that.identite) && Objects.equals(url, that.url) && Objects.equals(films, that.films);
    //    }
    //
    //    @Override
    //    public int hashCode() {
    //        return Objects.hash(id, identite, url, films);
    //    }
    //
    //    @Override
    //    public String toString() {
    //        final StringBuffer sb = new StringBuffer("Realisateur{");
    //        sb.append("id=").append(id);
    //        sb.append(", identité='").append(identite).append('\'');
    //        sb.append(", url='").append(url).append('\'');
    //        sb.append(", films=").append(films);
    //        sb.append('}');
    //        return sb.toString();
    //    }
}