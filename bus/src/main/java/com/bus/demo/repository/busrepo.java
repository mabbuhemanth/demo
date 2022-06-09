package com.bus.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bus.demo.entites.BusEntity;
@Repository
public interface busrepo extends CrudRepository<BusEntity,Integer>{

}
