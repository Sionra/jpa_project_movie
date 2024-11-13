package Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "lieu_de_naissance")
public class LieuNaissanceE extends LieuE implements Serializable {
    //    @ManyToMany(mappedBy="lieux")
//    private Set<NaissanceE> naissances;
//
//    {
//        naissances = new HashSet<NaaissanceE>();
//    }

    public LieuNaissanceE(){
        super();
    }

    public LieuNaissanceE(String quartier, String ville, String etat, String pays){
        super(quartier, ville, etat, pays);
    }
}
