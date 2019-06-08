/*
 *
 * This file is a confidential property of CVC Test. No part of this
 * file may be reproduced or copied.
 *
 */
package com.cvctest.backend.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alisson
 *
 */
public class HotelDetail extends AjaxResult {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2206679412764620011L;
	
	private String name;
	private Integer id;
	private Integer cityCode;
	private String cityName;
	private List<Room> rooms = new ArrayList<Room>();
	
	public HotelDetail() {
	}
	
	public HotelDetail(List<Room> value) {
		this.rooms = value;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCityCode() {
		return cityCode;
	}

	public void setCityCode(Integer cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
}
