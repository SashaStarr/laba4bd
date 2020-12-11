package com.starytskyy.model.entity;

import com.starytskyy.model.annotation.Table;
import com.starytskyy.model.annotation.Column;
import com.starytskyy.model.annotation.PrimaryKey;

@Table(name = "description")
public class Description {

    @PrimaryKey
    @Column(name = "film_id")
    private Integer filmId;

    @Column(name = "description", length = 45)
    private String description;


    public Description() {
    }

    public Description( String description) {
        this(-1, description);
    }

    public Description(Integer filmId, String description) {
        this.filmId = filmId;
        this.description = description;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Description [filmId=" + filmId + ", description= " + description
                + "]";
    }
}
