package ru.clevertec.homework01.logistic;

import ru.clevertec.homework01.producer.Producer;
import ru.clevertec.homework01.producer.Product;
import ru.clevertec.homework01.transport.CarTransport;
import ru.clevertec.homework01.transport.Transport;

public class CarLogistic extends Logistic {	
	
	public CarLogistic(Producer<? extends Product> producer) {
		super(producer);
	}

	@Override
	public Transport createTransport() {
		return new CarTransport();		
	}
	
}