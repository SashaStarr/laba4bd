package com.starytskyy.controller;

import com.starytskyy.model.entity.ActorsCast;
import com.starytskyy.service.ActorsCastService;

public class ActorsCastController extends AbstractController<ActorsCast, Integer, ActorsCastService> {

    public ActorsCastController() {
        super(ActorsCastService.class);
    }

}
