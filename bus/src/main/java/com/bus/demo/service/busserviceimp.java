package com.bus.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.demo.entites.BusEntity;
import com.bus.demo.entites.BusRouteEntity;
import com.bus.demo.repository.busrepo;
import com.bus.demo.repository.busrouterepo;
@Service
public class busserviceimp implements BusRouteService{
	
	@Autowired
	busrouterepo repo;
	
	@Autowired
	busrepo repo1;

	@Override
	public BusRouteEntity createbus(BusRouteEntity bus) {
		return repo.save(bus);
	}

	@Override
	public BusRouteEntity getbusbyroutid(Integer id) {
		Optional<BusRouteEntity> bs=repo.findById(id);
		return bs.get();
	}

	@Override
	public String deletebusbyroutid(Integer id) {
		repo.deleteById(id);
		return "true";
	}

	@Override
	public BusEntity createbus(BusEntity bus1) {
		return repo1.save(bus1);
	}

	@Override
	public BusRouteEntity findbyrouteid(Integer routeid) {
		
		Optional<BusRouteEntity> bs=repo.findById(routeid);
		return bs.get();
	}
	
	
}
