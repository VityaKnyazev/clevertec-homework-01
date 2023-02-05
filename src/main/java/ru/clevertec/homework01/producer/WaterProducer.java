package ru.clevertec.homework01.producer;

import java.math.BigDecimal;

import ru.clevertec.homework01.product.Water;

public class WaterProducer implements Producer {

	@Override
	public Water produce() {
		return new Water("DaLiNa", "H/s", "Oldest quality mineral water", new BigDecimal(5.66));
	}
}