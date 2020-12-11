package com.starytskyy.service;

import com.starytskyy.DAO.RatingDAO;
import com.starytskyy.model.entity.Rating;

public class RatingService extends AbstractService<Rating,Integer,RatingDAO> {

    public RatingService() {
        super(RatingDAO.class);
    }

}