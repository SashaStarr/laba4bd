package com.starytskyy.service;

import com.starytskyy.DAO.ActorsCastDAO;
import com.starytskyy.model.entity.ActorsCast;

public class ActorsCastService extends AbstractService<ActorsCast,Integer,ActorsCastDAO> {

    public ActorsCastService() {
        super(ActorsCastDAO.class);
    }

}