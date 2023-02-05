package ru.clevertec.homework01.logistic;

import ru.clevertec.homework01.producer.Producer;
import ru.clevertec.homework01.transport.BoatTransport;
import ru.clevertec.homework01.transport.Transport;

public class BoatLogistic extends Logistic {
	
	public BoatLogistic(Producer producer) {
		super(producer);
	}

	@Override
	public Transport createTransport() {
		return new BoatTransport();
	}

}
