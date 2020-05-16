package com.exercice.exo.dao;

import com.exercice.exo.model.Company;
import com.exercice.exo.model.Device;
import com.exercice.exo.model.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DeviceDAO extends JpaRepository<Device, Long> {

    Device findById(long id);

}
