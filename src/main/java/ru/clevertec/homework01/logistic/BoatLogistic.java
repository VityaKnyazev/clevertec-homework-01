package ru.clevertec.homework01.logistic;

import ru.clevertec.homework01.transport.BoatTransport;
import ru.clevertec.homework01.transport.Transport;

public class BoatLogistic extends Logistic {

	@Override
	public Transport createTransport() {
		return new BoatTransport();
	}

}
