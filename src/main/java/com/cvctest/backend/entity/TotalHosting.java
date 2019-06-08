package com.cvctest.backend.entity;

import java.io.Serializable;
import java.util.List;

public class TotalHosting implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5891828943969766551L;
	private Integer id;
	private String cityName;
	private List<RoomResult> rooms;
	
	public TotalHosting(){}
	public TotalHosting(Integer id, String cityName, List<RoomResult> roomResultList){
		this.id = id;
		this.cityName = cityName;
		this.rooms = roomResultList;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public List<RoomResult> getRooms() {
		return rooms;
	}
	public void setRooms(List<RoomResult> rooms) {
		this.rooms = rooms;
	}
}
