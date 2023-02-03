package ru.clevertec.homework01.producer;

import java.math.BigDecimal;

import ru.clevertec.homework01.producer.GoodProducer.Good;

public class GoodProducer implements Producer<Good> {
	@Override
	public Good produce() {
		return new Good("Unknown good", new BigDecimal(50.25));
	}
	
	public static class Good {
		private String name;
		private BigDecimal price;
		
		public Good(String name, BigDecimal price) {
			this.name = name;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public BigDecimal getPrice() {
			return price;
		}
	}
}
