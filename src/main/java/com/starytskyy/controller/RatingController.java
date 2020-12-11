package com.starytskyy.controller;

import com.starytskyy.model.entity.Rating;
import com.starytskyy.service.RatingService;

public class RatingController extends AbstractController<Rating, Integer, RatingService> {

    public RatingController() {
        super(RatingService.class);
    }

}