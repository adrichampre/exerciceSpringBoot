package com.exercice.exo.controller;

import com.exercice.exo.dao.CompanyDAO;
import com.exercice.exo.dao.DeviceDAO;
import com.exercice.exo.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyController {

    @Autowired
    private CompanyDAO companyDAO;

    /*
       To get all companies
       localhost:8080/Company
   */
    @GetMapping(value = "Company")
    public List<Company> listeCompany(){
        return companyDAO.findAll();
    }

    /*
    To get a company by its id
    localhost:8080/Entity/{id}
    */
    @GetMapping(value = "Company/{id}")
    public Company afficherCompany(@PathVariable int id){

        return companyDAO.findById(id);
    }

    /*
    To save a company
    localhost:8080/Company}
    */
    @PostMapping(value = "/Company")
    public void ajouterEntity(@RequestBody Company company){
        companyDAO.save(company);
    }
}
