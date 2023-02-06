package ru.clevertec.homework01.consumer;

import ru.clevertec.homework01.product.Product;

public class ParcelConsumer implements Consumer {

	@Override
	public void consume(Product product) {
		System.out.println("Consumer got the parsel Product" + product);		
	}
}
