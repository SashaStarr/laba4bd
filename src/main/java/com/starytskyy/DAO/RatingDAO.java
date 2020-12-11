package com.starytskyy.DAO;

import com.starytskyy.model.entity.Rating;

public class RatingDAO extends BaseDAO<Rating, Integer> {

    public RatingDAO() {
        super(Rating.class);
    }

}