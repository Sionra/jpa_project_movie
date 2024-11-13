package bo;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="acteur")
public class Acteur implements Serializable {
    @Id
    @Column(name="ID")
    private String id;
    @Column(name="IDENTITE")
    private String identite;
    @Column(name="URL")
    private String url;
    @Column(name="HEIGHT")
    private double height;
    @ManyToOne
    @JoinColumn(name="NAISSANCE_ID")
    private Naissance naissance;
    @OneToMany(mappedBy = "acteur",cascade = CascadeType.ALL)
    private Set<Role> roles;
    @OneToMany(mappedBy = "acteur")
    private Set<CastingPrincipal> castingPrincipals;

    {
        roles = new HashSet<Role>();
        castingPrincipals = new HashSet<CastingPrincipal>();
    }


    public Acteur (){}

    public Acteur(String id, String identite, String url, double height, Naissance naissance) {
        this.id = id;
        this.identite = identite;
        this.url = url;
        this.height = height;
        this.naissance = naissance;
    }

    /**
     * Getter for identite
     * return identite
     */
    public String getIdentite() {
        return identite;
    }

    /**
     * Setter for identite
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

    /**
     * Getter for height
     * return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Setter for height
     *
     * @param height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Acteur acteur = (Acteur) o;
        return Double.compare(height, acteur.height) == 0 && Objects.equals(id, acteur.id) && Objects.equals(identite, acteur.identite) && Objects.equals(url, acteur.url) && Objects.equals(naissance, acteur.naissance) && Objects.equals(roles, acteur.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, identite, url, height, naissance, roles);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Acteur{");
        sb.append("id='").append(id).append('\'');
        sb.append(", identite='").append(identite).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", height=").append(height);
        sb.append(", naissance=").append(naissance);
        sb.append(", roles=").append(roles);
        sb.append('}');
        return sb.toString();
    }
}
