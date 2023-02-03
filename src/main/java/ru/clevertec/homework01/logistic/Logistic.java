package ru.clevertec.homework01.logistic;

import ru.clevertec.homework01.transport.Transport;

public abstract class Logistic {
	private Transport transport;
	
	public void organizeDelivery() {
		transport = createTransport();
		transport.deliver();
	}
	
	abstract Transport createTransport();
}