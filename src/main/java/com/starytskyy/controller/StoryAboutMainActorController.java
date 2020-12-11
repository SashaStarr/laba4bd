package com.starytskyy.controller;

import com.starytskyy.model.entity.StoryAboutMainActor;
import com.starytskyy.service.StoryAboutMainActorService;

public class StoryAboutMainActorController extends AbstractController<StoryAboutMainActor, Integer, StoryAboutMainActorService> {

    public StoryAboutMainActorController() {
        super(StoryAboutMainActorService.class);
    }

}