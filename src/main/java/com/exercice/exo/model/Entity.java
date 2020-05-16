package com.exercice.exo.model;

import java.util.Date;

public abstract class Entity {

    private Long id;
    private Date createdAt;

    public Long getId() {
        return id;
    }

    public Entity(Long id, Date createdAt) {
        this.id = id;
        this.createdAt = createdAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                '}';
    }
}
