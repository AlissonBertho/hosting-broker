/*
 *
 * This file is a confidential property of CVC Test. No part of this
 * file may be reproduced or copied.
 *
 */
package com.cvctest.backend.entity;

/**
 * @author Alisson
 *
 */
public class Room extends AjaxResult {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3721616066376560190L;

	public Room() {}
	
	public Room(Integer roomID, String categoryName, Price price) {
		this.categoryName = categoryName;
		this.roomID = roomID;
		this.price = price;
	}
	
	private Integer roomID;
	private String categoryName;
	private Price price;

	public Integer getRoomID() {
		return roomID;
	}
	public void setRoomID(Integer roomID) {
		this.roomID = roomID;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Price getPrice() {
		return price;
	}
	public void setPrice(Price price) {
		this.price = price;
	}
}
