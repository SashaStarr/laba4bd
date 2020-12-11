package com.starytskyy.service;

import com.starytskyy.DAO.PriorityDAO;
import com.starytskyy.model.entity.Priority;

public class PriorityService extends AbstractService<Priority,Integer,PriorityDAO> {

    public PriorityService() {
        super(PriorityDAO.class);
    }

}