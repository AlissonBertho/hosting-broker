/*
 *
 * This file is a confidential property of CVC Test. No part of this
 * file may be reproduced or copied.
 *
 */
package com.cvctest.backend.entity;

import java.io.Serializable;

/**
 * @author Alisson
 *
 */
public class RoomResult implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3721616066376560190L;

	public RoomResult() {}
	
	public RoomResult(Integer roomID, String categoryName, PriceResult priceDetail, Double totalPrice) {
		this.categoryName = categoryName;
		this.roomID = roomID;
		this.totalPrice = totalPrice;
		this.priceDetail = priceDetail;
	}
	
	private Integer roomID;
	private String categoryName;
	private Double totalPrice;
	private PriceResult priceDetail;

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

	public PriceResult getPriceDetail() {
		return priceDetail;
	}
	public void setPriceDetail(PriceResult priceDetail) {
		this.priceDetail = priceDetail;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
}
