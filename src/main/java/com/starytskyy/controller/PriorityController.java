package com.starytskyy.controller;

import com.starytskyy.model.entity.Priority;
import com.starytskyy.service.PriorityService;

public class PriorityController extends AbstractController<Priority, Integer, PriorityService> {

    public PriorityController() {
        super(PriorityService.class);
    }

}