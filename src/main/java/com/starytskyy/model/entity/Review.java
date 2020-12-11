package com.starytskyy.model.entity;

import com.starytskyy.model.annotation.Table;
import com.starytskyy.model.annotation.Column;
import com.starytskyy.model.annotation.PrimaryKey;

@Table(name = "review")
public class Review {

    @PrimaryKey
    @Column(name = "id")
    private Integer id;

    @Column(name = "autor", length = 45)
    private String autor;

    @Column(name = "text", length = 45)
    private String text;

    @Column(name = "time_writing", length = 45)
    private String timeWriting;

    public Review() {
    }

    public Review( String autor,String text,String timeWriting) {
        this(-1,autor,text,timeWriting);
    }

    public Review(Integer id, String autor,String text,String timeWriting) {
        this.id = id;
        this.autor = autor;
        this.text = text;
        this.timeWriting = timeWriting;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTimeWriting() {
        return timeWriting;
    }

    public void setTimeWriting(String timeWriting) {
        this.timeWriting = timeWriting;
    }

    @Override
    public String toString() {
        return "Review [id=" + id + ", autor= " + autor +", text=" + text+ ", timeWriting"
                + timeWriting
                + "]";
    }
}