package com.starytskyy.DAO;

import com.starytskyy.model.entity.Film;

public class FilmDAO extends BaseDAO<Film, Integer> {

    public FilmDAO() {
        super(Film.class);
    }

}