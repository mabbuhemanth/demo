package com.bus.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bus.demo.entites.BusEntity;
import com.bus.demo.entites.BusRouteEntity;
import com.bus.demo.service.BusRouteService;
import com.bus.demo.service.busserviceimp;

@RestController
@RequestMapping("/bus")
public class buscontroller {
	@Autowired
	busserviceimp busser;
	
	
	@PostMapping("/create")
	public BusRouteEntity createbus(@RequestBody BusRouteEntity bus) {
		return busser.createbus(bus);
	}
	
	
	@GetMapping("/{busid}")
	public BusRouteEntity getbusbyroutid(@PathVariable Integer id) {
		return busser.getbusbyroutid(id);
	}
	
	
	@DeleteMapping("/{deleteid}")
	public String deletebusbyroutid(@PathVariable Integer id) {
		return busser.deletebusbyroutid(id);
	}
	
	
	@PostMapping("/createbus")
	public BusEntity createbus(@RequestBody BusEntity bus1) {
		return busser.createbus(bus1);
	}
	
	
	@GetMapping("/{routid}")
	public BusRouteEntity findbyrouteid(@PathVariable Integer routeid) {
		return busser.findbyrouteid(routeid);
	}

}
