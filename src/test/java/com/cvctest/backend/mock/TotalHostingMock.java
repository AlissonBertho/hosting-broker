package com.cvctest.backend.mock;

import java.util.ArrayList;
import java.util.List;

import com.cvctest.backend.entity.TotalHosting;

public class TotalHostingMock {

	public TotalHosting createMock(String name) {
		return new TotalHosting(1, name, new RoomResultMock().createMockList());
	}

	public List<TotalHosting> createMockList() {
	
		List<TotalHosting> hostingList = new ArrayList<TotalHosting>();
		hostingList.add(new TotalHosting(1, "Porto Seguro", new RoomResultMock().createMockList()));
		hostingList.add(new TotalHosting(2, "Rio de Janeiro", new RoomResultMock().createMockList()));
		hostingList.add(new TotalHosting(3, "PSão Paulo", new RoomResultMock().createMockList()));
	
		return hostingList;
	}
}
