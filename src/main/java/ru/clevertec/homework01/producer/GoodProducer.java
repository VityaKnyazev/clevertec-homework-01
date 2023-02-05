package ru.clevertec.homework01.producer;

import java.math.BigDecimal;

import ru.clevertec.homework01.product.Good;

public class GoodProducer implements Producer {
	@Override
	public Good produce() {
		return new Good("Some good", "Unknown description", new BigDecimal(50.25));
	}	
}