package ru.clevertec.homework01.logistic;

import ru.clevertec.homework01.producer.GoodProducer;
import ru.clevertec.homework01.producer.GoodProducer.Good;
import ru.clevertec.homework01.producer.Producer;
import ru.clevertec.homework01.transport.AirTransport;
import ru.clevertec.homework01.transport.Transport;

public class AirLogistic extends Logistic {

	@Override
	Transport createTransport() {
		return new AirTransport();
	}

	@Override
	Producer<Good> createProducer() {
		return new GoodProducer();
	}

}
