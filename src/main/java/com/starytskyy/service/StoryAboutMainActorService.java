package com.starytskyy.service;

import com.starytskyy.DAO.StoryAboutMainActorDAO;
import com.starytskyy.model.entity.StoryAboutMainActor;

public class StoryAboutMainActorService extends AbstractService<StoryAboutMainActor,Integer,StoryAboutMainActorDAO> {

    public StoryAboutMainActorService() {
        super(StoryAboutMainActorDAO.class);
    }

}