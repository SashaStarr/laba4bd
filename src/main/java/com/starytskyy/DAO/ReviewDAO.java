package com.starytskyy.DAO;

import com.starytskyy.model.entity.Review;

public class ReviewDAO extends BaseDAO<Review, Integer> {

    public ReviewDAO() {
        super(Review.class);
    }

}