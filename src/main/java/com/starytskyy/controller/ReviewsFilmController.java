package com.starytskyy.controller;

import com.starytskyy.model.entity.ReviewsFilm;
import com.starytskyy.service.ReviewsFilmService;

public class ReviewsFilmController extends AbstractController<ReviewsFilm, Integer, ReviewsFilmService> {

    public ReviewsFilmController() {
        super(ReviewsFilmService.class);
    }

}