package ru.clevertec.homework01.product;

import java.math.BigDecimal;

public class Good implements Product {
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
	public String toString() {
		return "Good [name=" + name + ", description=" + description + ", price=" + price + "]";
	}
}