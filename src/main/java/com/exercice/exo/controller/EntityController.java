package com.exercice.exo.controller;

import com.exercice.exo.dao.CompanyDAO;
import com.exercice.exo.dao.DeviceDAO;
import com.exercice.exo.model.Company;
import com.exercice.exo.model.Device;
import com.exercice.exo.model.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EntityController {


    @Autowired
    private CompanyDAO companyDAO;
    @Autowired
    private DeviceDAO deviceDAO;

    @GetMapping(value = "Entity")
    public List<Entity> listeEntity(){
        List<Entity> entities = new ArrayList<Entity>();
        entities.addAll(companyDAO.findAll());
        entities.addAll(deviceDAO.findAll());
        return entities;
    }

}
