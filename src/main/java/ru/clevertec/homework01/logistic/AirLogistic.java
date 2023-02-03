package ru.clevertec.homework01.logistic;

import ru.clevertec.homework01.transport.AirTransport;
import ru.clevertec.homework01.transport.Transport;

public class AirLogistic extends Logistic {

	@Override
	Transport createTransport() {
		return new AirTransport();
	}

}
