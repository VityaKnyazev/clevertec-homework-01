package ru.clevertec.homework01.product;

import java.math.BigDecimal;

public class Water implements Product {
	private String name;
	private String sort;
	private String description;
	private BigDecimal price;
	
	
	public Water(String name, String sort, String description, BigDecimal price) {
		this.name = name;
		this.sort = sort;
		this.description = description;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public String getSort() {
		return sort;
	}


	public String getDescription() {
		return description;
	}


	public BigDecimal getPrice() {
		return price;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setSort(String sort) {
		this.sort = sort;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public void setPrice(BigDecimal price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Water [name=" + name + ", sort=" + sort + ", description=" + description + ", price=" + price + "]";
	}
	
	
	
}