package ru.clevertec.homework01.logistic;

import ru.clevertec.homework01.transport.CarTransport;
import ru.clevertec.homework01.transport.Transport;

public class CarLogistic extends Logistic {	

	@Override
	public Transport createTransport() {
		return new CarTransport();		
	}
	
}