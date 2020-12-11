package com.starytskyy.service;

import com.starytskyy.DAO.FilmDAO;
import com.starytskyy.model.entity.Film;

public class FilmService extends AbstractService<Film,Integer,FilmDAO> {

    public FilmService() {
        super(FilmDAO.class);
    }

}