/*
 *
 * This file is a confidential property of CVC Test. No part of this
 * file may be reproduced or copied.
 *
 */
package com.cvctest.backend.bo;

import static com.cvctest.backend.to.BaseResponseTO.SUCCESS;
import static com.cvctest.backend.to.BaseResponseTO.ERROR;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cvctest.backend.entity.HotelDetail;
import com.cvctest.backend.entity.Price;
import com.cvctest.backend.entity.PriceResult;
import com.cvctest.backend.entity.Room;
import com.cvctest.backend.entity.RoomResult;
import com.cvctest.backend.entity.TotalHosting;
import com.cvctest.backend.to.TotalHostingResponseTO;

/**
 * @author Alisson
 *
 */
@Service
public class HostingBO {
	
	private static final Logger LOG = Logger.getLogger(HostingBO.class);

	public TotalHostingResponseTO calculateHostingPrices(Integer cityCode, String checkin, String checkout, Integer totalAdult, Integer totalChild) {

		List<HotelDetail> cityDetailList = getCityDetail(cityCode);

		SimpleDateFormat formatDate = new SimpleDateFormat("ddMMyyyy");
		
		Date dateBefore = null;
		Date dateAfter = null;
		try {
			dateBefore = formatDate.parse(checkin);
			dateAfter = formatDate.parse(checkout);
		} catch (ParseException e) {
			LOG.error(e);
			TotalHostingResponseTO betterRouteResponseTO = new TotalHostingResponseTO(SUCCESS);
			betterRouteResponseTO = new TotalHostingResponseTO(ERROR);
			betterRouteResponseTO.setMessage(e.getMessage());
			return betterRouteResponseTO;
		}
		
		long difference = dateAfter.getTime() - dateBefore.getTime();
		float daysBetween = (difference / (1000 * 60 * 60 * 24));
		
		return extractResult(cityDetailList, totalAdult, totalChild, daysBetween);
	}

	private TotalHostingResponseTO extractResult(List<HotelDetail> cityDetailList, Integer totalAdult, Integer totalChild, Float daysBetween) {
		
		TotalHostingResponseTO betterRouteResponseTO = new TotalHostingResponseTO(SUCCESS);
		List<TotalHosting> totalHostingList = new ArrayList<TotalHosting>();
		
		for (HotelDetail hotel : cityDetailList) {
			
			List<RoomResult> roomResultList = new ArrayList<RoomResult>();
			for (Room room : hotel.getRooms()) {
				Price price = room.getPrice();
				PriceResult priceResult = new PriceResult(price.getAdult(), price.getChild());
				
				double total = totalAdult == null ? 0d : ((price.getAdult() * totalAdult) + (price.getChild() * totalChild)) * daysBetween * 1.428571429d;
				
				RoomResult roomResult = new RoomResult(room.getRoomID(), room.getCategoryName(), priceResult, total);
				roomResultList.add(roomResult);
			}
			totalHostingList.add(new TotalHosting(hotel.getId(), hotel.getCityName(), roomResultList));
		}
		betterRouteResponseTO.setTotalHostingList(totalHostingList);
		
		return betterRouteResponseTO;
	}
	
	public TotalHostingResponseTO hotelDetail(Integer hotelID) {

		List<HotelDetail> hotelDetail = getHotelDetail(hotelID);
		
		return extractResult(hotelDetail, null, null, null);
	}

	private List<HotelDetail> getCityDetail(Integer cityID) {
		
		String url = "https://cvcbackendhotel.herokuapp.com/hotels/avail/" + cityID;

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<List<HotelDetail>> cotacao = null;
		try {
			cotacao =  restTemplate.exchange(url,
                    HttpMethod.GET, null, new ParameterizedTypeReference<List<HotelDetail>>() {
			});
			
		} catch (Exception e) {
			LOG.error(e);
		}
		return cotacao.getBody();
	}
	
	private List<HotelDetail> getHotelDetail(Integer hotelID) {
		
		String url = "https://cvcbackendhotel.herokuapp.com/hotels/" + hotelID;

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<List<HotelDetail>> cotacao = null;
		try {
			cotacao =  restTemplate.exchange(url,
                    HttpMethod.GET, null, new ParameterizedTypeReference<List<HotelDetail>>() {
			});
			
		} catch (Exception e) {
			LOG.error(e);
		}
		return cotacao.getBody();
	}
}
