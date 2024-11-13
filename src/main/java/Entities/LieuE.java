package Entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@SequenceGenerator(name = "lieu_seq", sequenceName = "lieu_sequence", allocationSize = 1)
public class LieuE implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "lieu_seq")
    private Long id;

    // A AJOUTER DANS TO OVERRIDE METHODS
    @Column(name="QUARTIER")
    private String quartier;

    @Column(name="VILLE")
    private String ville;

    @Column(name="ETAT")
    @JsonProperty("etatDept")
    private String etat;

    @Column(name="PAYS")
    private String pays;

    public LieuE(){}

    public LieuE(String quartier, String ville, String etat, String pays) {
        this.quartier = quartier;
        this.ville = ville;
        this.etat = etat;
        this.pays = pays;
    }

    /**
     * Getter for id
     * return id
     */
    public Long getId() {
        return id;
    }

    /**
     * Setter for id
     *
     * @param id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for ville
     * return ville
     */
    public String getVille() {
        return ville;
    }

    /**
     * Setter for ville
     *
     * @param ville to set
     */
    public void setVille(String ville) {
        this.ville = ville;
    }

    /**
     * Getter for etat
     * return etat
     */
    public String getEtat() {
        return etat;
    }

    /**
     * Setter for etat
     *
     * @param etat to set
     */
    public void setEtat(String etat) {
        this.etat = etat;
    }

    /**
     * Getter for pays
     * return pays
     */
    public String getPays() {
        return pays;
    }

    /**
     * Setter for pays
     *
     * @param pays to set
     */
    public void setPays(String pays) {
        this.pays = pays;
    }

    /**
     * Getter for quartier
     * return quartier
     */
    public String getQuartier() {
        return quartier;
    }

    /**
     * Setter for quartier
     *
     * @param quartier to set
     */
    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }

    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        LieuE lieu = (LieuE) o;
//        return id == lieu.id && Objects.equals(ville, lieu.ville) && Objects.equals(etat, lieu.etat) && Objects.equals(pays, lieu.pays) && Objects.equals(films, lieu.films) && Objects.equals(naissances, lieu.naissances);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, ville, etat, pays, films, naissances);
//    }
//
//    @Override
//    public String toString() {
//        final StringBuffer sb = new StringBuffer("Lieu{");
//        sb.append("id=").append(id);
//        sb.append(", ville='").append(ville).append('\'');
//        sb.append(", etat='").append(etat).append('\'');
//        sb.append(", pays=").append(pays);
//        sb.append(", films=").append(films);
//        sb.append(", naissances=").append(naissances);
//        sb.append('}');
//        return sb.toString();
//    }
}
