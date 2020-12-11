package com.starytskyy.model.entity;

import com.starytskyy.model.annotation.Table;
import com.starytskyy.model.annotation.Column;
import com.starytskyy.model.annotation.PrimaryKey;

import java.sql.Date;

@Table(name = "film")
public class Film {

    @PrimaryKey
    @Column(name = "id")
    private Integer id;

    @Column(name = "filmName", length = 45)
    private String filmName;

    @Column(name = "duration_in_minutes")
    private Integer durationInMinutes;

    @Column(name = "director", length = 45)
    private String director;

    @Column(name = "premiere_date")
    private Date premiereDate;

    @Column(name = "budgetInDollars")
    private Integer budgetInDollars;

    @Column(name = "profit_in_dollars")
    private Integer profitInDollars;


    public Film() {
    }

    public Film( String filmName, Integer durationInMinutes,String director,String premiereDate,
                 Integer budgetInDollars,Integer profitInDollars) {
        this(-1, filmName, durationInMinutes,director,premiereDate,budgetInDollars,profitInDollars);
    }

    public Film(Integer id, String filmName, Integer durationInMinutes,String director,
                String premiereDate,Integer budgetInDollars,Integer profitInDollars) {
        this.id = id;
        this.filmName = filmName;
        this.durationInMinutes = durationInMinutes;
        this.director = director;
        this.premiereDate = Date.valueOf(premiereDate);
        this.budgetInDollars = budgetInDollars;
        this.profitInDollars = profitInDollars;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public Integer getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(Integer durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Date getPremiereDate() {
        return premiereDate;
    }

    public void setPremiereDate(Date premiereDate) {
        this.premiereDate = premiereDate;
    }

    public Integer getBudgetInDollars() {
        return budgetInDollars;
    }

    public void setBudgetInDollars(Integer budgetInDollars) {
        this.budgetInDollars = budgetInDollars;
    }

    public Integer getProfitInDollars() {
        return profitInDollars;
    }

    public void setProfitInDollars(Integer profitInDollars) {
        this.profitInDollars = profitInDollars;
    }




    @Override
    public String toString() {
        return "Film [id=" + id + ", filmName=" + filmName + ", durationInMinutes=" + durationInMinutes + ", director " +
                director + ", premiereDate" + premiereDate + ", budgetInDollars" +budgetInDollars
                +", profitInDollars" +profitInDollars
                + "]";
    }
}