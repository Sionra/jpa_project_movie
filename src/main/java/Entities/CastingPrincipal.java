package Entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;
import java.util.UUID;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class CastingPrincipal {
    String id;

    @JsonProperty("castingPrincipal")
    List<Acteur> acteurs;

    public CastingPrincipal(){
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Acteur> getActeurs() {
        return acteurs;
    }

    public void setActeurs(List<Acteur> acteurs) {
        this.acteurs = acteurs;
    }
}
