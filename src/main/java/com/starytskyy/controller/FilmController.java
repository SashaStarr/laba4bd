package com.starytskyy.controller;

import com.starytskyy.model.entity.Film;
import com.starytskyy.service.FilmService;

public class FilmController extends AbstractController<Film, Integer, FilmService> {

    public FilmController() {
        super(FilmService.class);
    }

}