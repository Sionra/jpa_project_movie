// PARSED
// LISTE ACTEURS A FIX

package ParsingClasses;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.util.List;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class CastingPrincipal {
    private static int idCounter = 0;
    int id;

    @JsonProperty("castingPrincipal")
    List<Acteur> acteurs;

    public CastingPrincipal(){
        this.id = ++idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Acteur> getActeurs() {
        return acteurs;
    }

    public void setActeurs(List<Acteur> acteurs) {
        this.acteurs = acteurs;
    }
}
