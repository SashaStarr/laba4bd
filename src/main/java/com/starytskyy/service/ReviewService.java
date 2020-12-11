package com.starytskyy.service;

import com.starytskyy.DAO.ReviewDAO;
import com.starytskyy.model.entity.Review;

public class ReviewService extends AbstractService<Review,Integer,ReviewDAO> {

    public ReviewService() {
        super(ReviewDAO.class);
    }

}