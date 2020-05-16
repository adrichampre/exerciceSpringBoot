package com.exercice.exo.dao;

import com.exercice.exo.model.Company;
import com.exercice.exo.model.Entity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class EntityDAO {

    public static List<Entity> entities = new ArrayList<>();

    static {
        entities.add(new Company((long)1, new Date(), "Test1"));
        entities.add(new Company((long)2, new Date(), "Test2"));
        entities.add(new Company((long)3, new Date(), "Test3"));
    }

    public List<Entity> findAll(){
        return entities;
    }

    public Entity findById(long id){
        for (Entity entity : entities) {
            if(entity.getId() == id){
                return entity;
            }
        }
        return null;
    }

    public Entity save(Entity entity){
        entities.add(entity);
        return entity;
    }

}
