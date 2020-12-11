package com.starytskyy.controller;

import com.starytskyy.model.entity.Review;
import com.starytskyy.service.ReviewService;

public class ReviewController extends AbstractController<Review, Integer, ReviewService> {

    public ReviewController() {
        super(ReviewService.class);
    }

}