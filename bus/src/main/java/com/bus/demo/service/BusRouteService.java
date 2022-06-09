package com.bus.demo.service;

import com.bus.demo.entites.BusEntity;
import com.bus.demo.entites.BusRouteEntity;

public interface BusRouteService {
    public BusRouteEntity createbus(BusRouteEntity bus);
    public BusRouteEntity getbusbyroutid(Integer id);
    public String deletebusbyroutid(Integer id);
    public BusEntity createbus(BusEntity bus1);
    public BusRouteEntity findbyrouteid(Integer routeid);
    
    
    
}