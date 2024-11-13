package Entities;

import bo.Film;
import Entities.LieuE;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "lieu_de_tournage")
public class LieuTournageE extends LieuE implements Serializable {
//    @ManyToMany(mappedBy="lieux")
//    private Set<Film> films;
//
//    {
//        films = new HashSet<Film>();
//    }

    public LieuTournageE(){
        super();
    }

    public LieuTournageE(String quartier, String ville, String etat, String pays){
        super(quartier, ville, etat, pays);
    }
}
