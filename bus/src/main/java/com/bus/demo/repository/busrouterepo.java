package com.bus.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bus.demo.entites.BusRouteEntity;
@Repository
public interface busrouterepo extends CrudRepository<BusRouteEntity,Integer>{

}
