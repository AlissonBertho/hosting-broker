package com.cvctest.backend.mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.cvctest.backend.entity.TotalHosting;
import com.cvctest.backend.to.BaseResponseTO;
import com.cvctest.backend.to.TotalHostingResponseTO;

public class TotalHostingResponseTOMock {

	public TotalHostingResponseTO createMock(String tipo) {
		List<TotalHosting> totalHostingMockList;
		if ("hotel".equals( tipo)) {
			totalHostingMockList = Arrays.asList(new TotalHostingMock().createMock("Santo Andre"));
		} else {
			totalHostingMockList = new TotalHostingMock().createMockList();
		}
		TotalHostingResponseTO thrTO = new TotalHostingResponseTO(BaseResponseTO.SUCCESS);
		thrTO.setTotalHostingList(totalHostingMockList);
		return thrTO;
	}

	public List<TotalHostingResponseTO> createMockList() {
		List<TotalHostingResponseTO> totalHostingList = new ArrayList<TotalHostingResponseTO>();
		totalHostingList.add(new TotalHostingResponseTOMock().createMock("Porto Seguro"));
		totalHostingList.add(new TotalHostingResponseTOMock().createMock("Sao Paulo"));
		return totalHostingList;
	}
}
