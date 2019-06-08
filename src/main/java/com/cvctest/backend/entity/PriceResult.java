package com.cvctest.backend.entity;

import java.io.Serializable;

public class PriceResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2421038521131261945L;
	Double pricePerDayAdult;
	Double pricePerDayChild;
	
	public PriceResult(Double pricePerDayAdult, Double pricePerDayChild) {
		this.pricePerDayAdult = pricePerDayAdult;
		this.pricePerDayChild = pricePerDayChild;
	}
	
	public Double getPricePerDayAdult() {
		return pricePerDayAdult;
	}
	public void setPricePerDayAdult(Double pricePerDayAdult) {
		this.pricePerDayAdult = pricePerDayAdult;
	}
	public Double getPricePerDayChild() {
		return pricePerDayChild;
	}
	public void setPricePerDayChild(Double pricePerDayChild) {
		this.pricePerDayChild = pricePerDayChild;
	}
	
	
}
