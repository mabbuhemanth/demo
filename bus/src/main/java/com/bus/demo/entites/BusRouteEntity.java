package com.bus.demo.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class BusRouteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String source;
    private String destination;
    private String stations;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getStations() {
		return stations;
	}
	public void setStations(String stations) {
		this.stations = stations;
	}
	public BusRouteEntity() {
		super();
	}
	@Override
	public String toString() {
		return "BusRouteEntity [id=" + id + ", title=" + title + ", source=" + source + ", destination=" + destination
				+ ", stations=" + stations + "]";
	}
    
    
    
}
