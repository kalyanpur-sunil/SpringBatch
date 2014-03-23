package org.sunil.javabrains.domain;

import java.io.Serializable;

public class RidershipBusRoute implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String route;
	private String date;
	private String dayType;
	private String rides;
	
	public RidershipBusRoute() {
		super();
	}
	
	public String getRoute() {
		return route;
	}
	
	public void setRoute(String route) {
		this.route = route;
	}
	
	public String getRides() {
		return rides;
	}
	
	public void setRides(String rides) {
		this.rides = rides;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getDayType() {
		return dayType;
	}
	
	public void setDayType(String dayType) {
		this.dayType = dayType;
	}
	
}
