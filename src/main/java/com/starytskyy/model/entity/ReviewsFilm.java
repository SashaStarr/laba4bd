package com.starytskyy.model.entity;

import com.starytskyy.model.annotation.Table;
import com.starytskyy.model.annotation.Column;
import com.starytskyy.model.annotation.PrimaryKey;

@Table(name = "reviews_film")
public class ReviewsFilm {

    @PrimaryKey
    @Column(name = "film_id")
    private Integer filmId;

    @PrimaryKey
    @Column(name = "review_id")
    private Integer reviewId;

    public ReviewsFilm() {
    }

    public ReviewsFilm( Integer reviewId) {
        this(-1, reviewId);
    }

    public ReviewsFilm(Integer filmId, Integer reviewId) {
        this.filmId = filmId;
        this.reviewId = reviewId;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    @Override
    public String toString() {
        return "ReviewsFilm [filmId=" + filmId + ", reviewId= " + reviewId
                + "]";
    }
}
