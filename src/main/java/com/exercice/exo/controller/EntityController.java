package com.exercice.exo.controller;

import com.exercice.exo.model.Company;
import com.exercice.exo.model.Entity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class EntityController {

    //Entity/{id}
    @GetMapping(value = "Entity/{id}")
    public Entity afficherEntity(@PathVariable int id){

        Entity entity = new Company((long) 1, new Date(), "Purifly");

        return entity;
    }
}
