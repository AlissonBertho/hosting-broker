/*
 *
 * This file is a confidential property of CVC Test. No part of this
 * file may be reproduced or copied.
 *
 */
package com.cvctest.backend.service;

import static com.cvctest.backend.to.BaseResponseTO.ERROR;
import static com.cvctest.backend.to.BaseResponseTO.SUCCESS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cvctest.backend.bo.HostingBO;
import com.cvctest.backend.to.TotalHostingResponseTO;

/**
 * @author Alisson
 *
 */
@RestController
public class HostingService {

	@Autowired
	private HostingBO hostingBO;

	@RequestMapping(value = "/calculateTotalHosting/{cityCode}/{checkin}/{checkout}/{totalAdult}/{totalChild}", method = RequestMethod.GET)
	public TotalHostingResponseTO calculateTotalHosting(@PathVariable Integer cityCode,
			@PathVariable String checkin, @PathVariable String checkout,
			@PathVariable Integer totalAdult, @PathVariable Integer totalChild) {
		TotalHostingResponseTO totalHostingResponseTO = new TotalHostingResponseTO(SUCCESS);
		try {
			totalHostingResponseTO = hostingBO.calculateHostingPrices(cityCode, checkin, checkout, totalAdult, totalChild);
		} catch (Exception e) {
			totalHostingResponseTO = new TotalHostingResponseTO(ERROR);
		}
		return totalHostingResponseTO;
	}
	
	@RequestMapping(value = "/hotelDetail/{hotelID}", method = RequestMethod.GET)
	public TotalHostingResponseTO hotelDetail(@PathVariable Integer hotelID) {
		TotalHostingResponseTO totalHostingResponseTO = new TotalHostingResponseTO(SUCCESS);
		try {
			totalHostingResponseTO = hostingBO.hotelDetail(hotelID);
		} catch (Exception e) {
			totalHostingResponseTO = new TotalHostingResponseTO(ERROR);
		}
		return totalHostingResponseTO;
	}
	
}

