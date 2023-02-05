package ru.clevertec.homework01.logistic;

import ru.clevertec.homework01.producer.Producer;
import ru.clevertec.homework01.producer.Product;
import ru.clevertec.homework01.transport.Transport;

public abstract class Logistic {
	private Transport transport;
	private Producer<? extends Product> producer;
	
	Logistic(Producer<? extends Product> producer) {
		this.producer = producer;
	}
	
	public void organizeDelivery() {
		transport = createTransport();
		
		producerParcel();
		
		transport.deliver();
	}
	
	private void producerParcel() {
		Product product = (Product) producer.produce();
		product.show();
	}
	
	abstract Transport createTransport();
}