package com.cvctest.backend.mock;

import java.util.ArrayList;
import java.util.List;

import com.cvctest.backend.entity.RoomResult;

public class RoomResultMock {

	public RoomResult createMock(String name) {
		return new RoomResult(1, "Standard", new PriceResultMock().createMock() , 1372.54d);
	}

	public List<RoomResult> createMockList() {

		List<RoomResult> roomList = new ArrayList<RoomResult>();
		roomList.add(new RoomResult(1, "Standard", new PriceResultMock().createMock() , 1372.54d));
		roomList.add(new RoomResult(1, "Standard", new PriceResultMock().createMock() , 10000.00d));

		return roomList;
	}
}
