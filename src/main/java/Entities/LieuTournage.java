package Entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

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
