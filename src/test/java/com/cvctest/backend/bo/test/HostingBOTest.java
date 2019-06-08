package com.cvctest.backend.bo.test;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.cvctest.backend.bo.HostingBO;
import com.cvctest.backend.mock.TotalHostingResponseTOMock;
import com.cvctest.backend.service.HostingService;
import com.cvctest.backend.to.TotalHostingResponseTO;

public class HostingBOTest {

	@InjectMocks
	private HostingService hostingService;
	
	@Mock
	private HostingBO hostingBO;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		when(hostingBO.calculateHostingPrices(1032, "10062019", "12062019", 2, 1)).thenReturn(new TotalHostingResponseTOMock().createMock("city"));
		when(hostingBO.hotelDetail(1)).thenReturn(new TotalHostingResponseTOMock().createMock("hotel"));
	}


	@Test
	public void calculateHostingPricesTest() {
		TotalHostingResponseTO resultHostingPrice = hostingService.calculateTotalHosting(1032, "10062019", "12062019", 2, 1);
		
		Assert.assertEquals(resultHostingPrice.getTotalHostingList().get(0).getCityName(), "Porto Seguro");
	}
	
	@Test
	public void hotelDetailTest() {
		TotalHostingResponseTO resultHostingPrice = hostingService.hotelDetail(1);
		
		Assert.assertEquals(resultHostingPrice.getTotalHostingList().get(0).getCityName(), "Santo Andre");
	}
}
