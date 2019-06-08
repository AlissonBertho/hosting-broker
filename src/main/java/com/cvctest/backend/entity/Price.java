package com.cvctest.backend.entity;

public class Price extends AjaxResult {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4695391219404432222L;
	private Double adult;
	private Double child;
	
	public Price() {}
	
	public Price(Double adult, Double child) {
		this.adult = adult;
		this.child = child;
	}
	
	public Double getAdult() {
		return adult;
	}
	public void setAdult(Double adult) {
		this.adult = adult;
	}
	public Double getChild() {
		return child;
	}
	public void setChild(Double child) {
		this.child = child;
	}
	
	
}
