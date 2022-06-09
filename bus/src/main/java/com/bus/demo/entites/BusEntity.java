package com.bus.demo.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BusEntity {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;
    private String busNo;
    private String color;
    private int capacity;
    private int routeId;
    
    
    
	public BusEntity() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getRouteId() {
		return routeId;
	}
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}
	@Override
	public String toString() {
		return "BusEntity [id=" + id + ", busNo=" + busNo + ", color=" + color + ", capacity=" + capacity + ", routeId="
				+ routeId + "]";
	}
    
    
    
    
}
