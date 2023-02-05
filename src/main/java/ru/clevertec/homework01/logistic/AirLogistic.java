package ru.clevertec.homework01.logistic;

import ru.clevertec.homework01.producer.Producer;
import ru.clevertec.homework01.transport.AirTransport;
import ru.clevertec.homework01.transport.Transport;

public class AirLogistic extends Logistic {
	
	public AirLogistic(Producer producer) {
		super(producer);
	}

	@Override
	Transport createTransport() {
		return new AirTransport();
	}

}
