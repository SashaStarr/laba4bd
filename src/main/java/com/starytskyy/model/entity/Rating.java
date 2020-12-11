package com.starytskyy.model.entity;

import com.starytskyy.model.annotation.Table;
import com.starytskyy.model.annotation.Column;
import com.starytskyy.model.annotation.PrimaryKey;

@Table(name = "Rating")
public class Rating {

    @PrimaryKey
    @Column(name = "film_id")
    private Integer filmId;

    @PrimaryKey
    @Column(name = "priority_id")
    private Integer priorityId;

    @Column(name = "rating")
    private Integer rating;


    public Rating() {
    }

    public Rating(Integer rating) {
        this(-1, -1,rating);
    }

    public Rating(Integer filmId, Integer priorityId,Integer rating) {
        this.filmId = filmId;
        this.priorityId = priorityId;
        this.rating = rating;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public Integer getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(Integer priorityId) {
        this.priorityId = priorityId;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Rating [filmId=" + filmId + ", priorityId= " + priorityId + ", rating="
                + rating
                + "]";
    }
}
