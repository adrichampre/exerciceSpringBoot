package com.exercice.exo.model;

import java.util.Date;

public class Company extends Entity{

    private String name;

    public Company(Long id, Date createdAt, String name) {
        super(id, createdAt);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                '}';
    }
}
