package ru.clevertec.homework01.producer;

import java.math.BigDecimal;

public class GoodProducer implements Producer {
	@Override
	public Good produce() {
		return new Good("Some good", "Unknown description", new BigDecimal(50.25));
	}
	
	public static class Good implements Product {
		private String name;
		private String description;
		private BigDecimal price;
		
		public Good(String name, String description, BigDecimal price) {
			this.name = name;
			this.description = description;
			this.price = price;
		}

		public String getName() {
			return name;
		}
		
		public String getDescription() {
			return description;
		}

		public BigDecimal getPrice() {
			return price;
		}

		@Override
		public void show() {
			System.out.println("Good Producer produced good product[name=]" + name + ", description=" + description + ", price=" + price);
		}
	}
}
