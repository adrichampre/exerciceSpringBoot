package com.exercice.exo.dao;

import com.exercice.exo.model.Company;
import com.exercice.exo.model.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface CompanyDAO extends JpaRepository<Company, Long> {

    Company findById(long id);

}
