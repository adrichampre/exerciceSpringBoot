package com.exercice.exo.controller;

import com.exercice.exo.dao.EntityDAO;
import com.exercice.exo.model.Company;
import com.exercice.exo.model.Device;
import com.exercice.exo.model.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class EntityController {


    @Autowired
    private EntityDAO entityDAO;

    /*
        To get all entities
        localhost:8080/Entity
    */
    @GetMapping(value = "Entity")
    public List<Entity> listeEntity(){
        return entityDAO.findAll();
    }

    /*
        To get an entity by its id
        localhost:8080/Entity/{id}
    */
    @GetMapping(value = "Entity/{id}")
    public Entity afficherEntity(@PathVariable int id){

        return entityDAO.findById(id);
    }

    /*
        To save a company
        localhost:8080/Company}
    */
    @PostMapping(value = "/Company")
    public void ajouterEntity(@RequestBody Company company){
        entityDAO.save(company);
    }

    /*
        To save a device
        localhost:8080/Device
    */
    @PostMapping(value = "/Device")
    public void ajouterEntity(@RequestBody Device device){
        entityDAO.save(device);
    }
}
