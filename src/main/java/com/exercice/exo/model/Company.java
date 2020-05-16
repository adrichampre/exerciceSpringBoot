package com.exercice.exo.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;


@javax.persistence.Entity
public class Company extends Entity{


    private String name;

    public Company(){

    }

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
