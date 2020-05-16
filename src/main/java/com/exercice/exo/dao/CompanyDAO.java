package com.exercice.exo.dao;

import com.exercice.exo.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyDAO extends JpaRepository<Company, Long> {

    Company findById(long id);

}
