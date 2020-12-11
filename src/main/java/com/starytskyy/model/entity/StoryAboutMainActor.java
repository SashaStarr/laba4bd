package com.starytskyy.model.entity;

import com.starytskyy.model.annotation.Table;
import com.starytskyy.model.annotation.Column;
import com.starytskyy.model.annotation.PrimaryKey;

@Table(name = "StoryAboutMainActor")
public class StoryAboutMainActor {

    @PrimaryKey
    @Column(name = "actors_cast_id")
    private Integer actorsCastId;

    @Column(name = "story", length = 45)
    private String story;


    public StoryAboutMainActor() {
    }

    public StoryAboutMainActor(String story) {
        this(-1, story);
    }

    public StoryAboutMainActor(Integer actorsCastId, String story) {
        this.actorsCastId = actorsCastId;
        this.story = story;
    }

    public Integer getActorsCastId() {
        return actorsCastId;
    }

    public void setActorsCastId(Integer actorsCastId) {
        this.actorsCastId = actorsCastId;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    @Override
    public String toString() {
        return "StoryAboutMainActor [actorsCastId=" + actorsCastId + ", story= " + story
                + "]";
    }
}
