package com.starytskyy.controller;

import com.starytskyy.model.entity.Description;
import com.starytskyy.service.DescriptionService;

public class DescriptionController extends AbstractController<Description, Integer, DescriptionService> {

    public DescriptionController() {
        super(DescriptionService.class);
    }

}