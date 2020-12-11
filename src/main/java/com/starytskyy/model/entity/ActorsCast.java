package com.starytskyy.model.entity;

import com.starytskyy.model.annotation.Table;
import com.starytskyy.model.annotation.Column;
import com.starytskyy.model.annotation.PrimaryKey;

@Table(name = "actors_cast")
public class ActorsCast {

    @PrimaryKey
    @Column(name = "id")
    private Integer id;
    @PrimaryKey
    @Column(name = "film_id")
    private Integer filmId;

    @Column(name = "numbers_actors")
    private Integer numbersActors;

    @Column(name = "name_and_surname_main_actor", length = 45)
    private String nameAndSurnameMainActor;


    public ActorsCast() {
    }

    public ActorsCast(Integer numbersActors,String nameAndSurnameMainActor) {
        this(-1,-1,numbersActors,nameAndSurnameMainActor);
    }

    public ActorsCast(Integer id,Integer filmId,Integer numbersActors,String nameAndSurnameMainActor) {
        this.id = id;
        this.filmId = filmId;
        this.numbersActors = numbersActors;
        this.nameAndSurnameMainActor = nameAndSurnameMainActor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }
    public Integer getNumbersActors() {
        return numbersActors;
    }

    public void setNumbersActors(Integer numbersActors) {
        this.numbersActors = numbersActors;
    }

    public String getNameAndSurnameMainActor() {
        return nameAndSurnameMainActor;
    }

    public void setNameAndSurnameMainActor(String nameAndSurnameMainActor) {
        this.nameAndSurnameMainActor = nameAndSurnameMainActor;
    }

    @Override
    public String toString() {
        return "ActorsCast [id="+ id +", filmId = "+ filmId + ", numbersActors =" + numbersActors
                + ", nameAndSurnameMainActor" +nameAndSurnameMainActor
                + "]";
    }
}
