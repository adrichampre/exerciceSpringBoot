package com.exercice.exo.controller;

import com.exercice.exo.dao.CompanyDAO;
import com.exercice.exo.dao.DeviceDAO;
import com.exercice.exo.model.Company;
import com.exercice.exo.model.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeviceController {

    @Autowired
    private DeviceDAO deviceDAO;

    /*
To get all devices
localhost:8080/Device
*/
    @GetMapping(value = "Device")
    public List<Device> listeDevice(){
        return deviceDAO.findAll();
    }

    @GetMapping(value = "Device/{id}")
    public Device afficherDevice(@PathVariable int id){

        return deviceDAO.findById(id);
    }

    /*
    To save a device
    localhost:8080/Device
*/
    @PostMapping(value = "/Device")
    public void ajouterEntity(@RequestBody Device device){
        deviceDAO.save(device);
    }

}
