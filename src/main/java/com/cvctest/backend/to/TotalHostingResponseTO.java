/*
 *
 * This file is a confidential property of CVC Test. No part of this
 * file may be reproduced or copied.
 *
 */
package com.cvctest.backend.to;

import java.util.List;

import com.cvctest.backend.entity.TotalHosting;

/**
 * @author Alisson
 *
 */
public class TotalHostingResponseTO extends BaseResponseTO {

	public TotalHostingResponseTO(Integer code) {
		super(code);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 5748453878903898759L;
	private List<TotalHosting> totalHostingList;
	
	public List<TotalHosting> getTotalHostingList() {
		return totalHostingList;
	}
	public void setTotalHostingList(List<TotalHosting> totalHostingList) {
		this.totalHostingList = totalHostingList;
	}
}
