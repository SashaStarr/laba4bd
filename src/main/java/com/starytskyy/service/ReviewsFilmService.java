package com.starytskyy.service;

import com.starytskyy.DAO.ReviewsFilmDAO;
import com.starytskyy.model.entity.ReviewsFilm;

public class ReviewsFilmService extends AbstractService<ReviewsFilm,Integer,ReviewsFilmDAO> {

    public ReviewsFilmService() {
        super(ReviewsFilmDAO.class);
    }

}