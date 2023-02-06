package ru.clevertec.homework01.logistic;

import ru.clevertec.homework01.consumer.Consumer;
import ru.clevertec.homework01.producer.Producer;
import ru.clevertec.homework01.product.Product;
import ru.clevertec.homework01.transport.Transport;

public abstract class Logistic {
	private Transport transport;
	private Producer producer;
	private Consumer consumer;
	
	Logistic(Producer producer, Consumer consumer) {
		this.producer = producer;
		this.consumer = consumer;
	}
	
	public void organizeDelivery() {
		transport = createTransport();
		
		Product product = producerParcel();		
		transport.deliver();
		
		consumer.consume(product);
	}
	
	private Product producerParcel() {
		Product product = (Product) producer.produce();
		System.out.println("Producer send " + product);
		return product;
	}
	
	abstract Transport createTransport();
}