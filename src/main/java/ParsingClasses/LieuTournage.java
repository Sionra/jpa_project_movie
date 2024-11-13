// PARSED
// LIST FILMS A FIX
package ParsingClasses;

import java.util.List;

public class LieuTournage extends Lieu{
    List<Film> films;

    public LieuTournage() {
        super();
    }

    @Override
    public List<Film> getFilms() {
        return films;
    }

    @Override
    public void setFilms(List<Film> films) {
        this.films = films;
    }
}
