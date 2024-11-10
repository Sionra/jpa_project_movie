// PARSED
// LIST NAISSANCES A FIX

package Entities;

import Deserializer.Attributs.LieuNaissanceDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

@JsonDeserialize(using = LieuNaissanceDeserializer.class)
public class LieuNaissance extends Lieu {
    List<Naissance> naissances;

    public LieuNaissance(){
        super();
    }

    public List<Naissance> getNaissances() {
        return naissances;
    }

    public void setNaissances(List<Naissance> naissances) {
        this.naissances = naissances;
    }
}
