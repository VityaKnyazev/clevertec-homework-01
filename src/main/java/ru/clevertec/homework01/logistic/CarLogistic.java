package ru.clevertec.homework01.logistic;

import ru.clevertec.homework01.consumer.Consumer;
import ru.clevertec.homework01.producer.Producer;
import ru.clevertec.homework01.transport.CarTransport;
import ru.clevertec.homework01.transport.Transport;

public class CarLogistic extends Logistic {	
	
	public CarLogistic(Producer producer, Consumer consumer) {
		super(producer, consumer);
	}

	@Override
	public Transport createTransport() {
		return new CarTransport();		
	}
	
}