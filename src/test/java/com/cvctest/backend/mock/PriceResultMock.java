package com.cvctest.backend.mock;

import java.util.ArrayList;
import java.util.List;

import com.cvctest.backend.entity.PriceResult;

public class PriceResultMock {

	public PriceResult createMock() {
		return new PriceResult(1372.54d, 848.61d);
	}

	public List<PriceResult> createMockList() {

		List<PriceResult> prices = new ArrayList<PriceResult>();
		prices.add(new PriceResult(1372.54d, 500.00d));
		prices.add(new PriceResult(1372.54d, 50.00d));

		return prices;
	}
}
