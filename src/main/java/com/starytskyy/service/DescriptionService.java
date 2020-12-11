package com.starytskyy.service;

import com.starytskyy.DAO.DescriptionDAO;
import com.starytskyy.model.entity.Description;

public class DescriptionService extends AbstractService<Description,Integer,DescriptionDAO> {

    public DescriptionService() {
        super(DescriptionDAO.class);
    }

}