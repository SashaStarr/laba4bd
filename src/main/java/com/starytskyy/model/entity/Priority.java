package com.starytskyy.model.entity;

import com.starytskyy.model.annotation.Table;
import com.starytskyy.model.annotation.Column;
import com.starytskyy.model.annotation.PrimaryKey;

@Table(name = "priority")
public class Priority {

    @PrimaryKey
    @Column(name = "id")
    private Integer id;

    @Column(name = "priority")
    private Integer priority;


    public Priority() {
    }

    public Priority( Integer priority) {
        this(-1,priority);
    }

    public Priority(Integer id, Integer priority) {
        this.id = id;
        this.priority = priority;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Priority [id=" + id + ", priority= " + priority
                + "]";
    }
}
