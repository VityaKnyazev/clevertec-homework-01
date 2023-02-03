package ru.clevertec.homework01.transport;

public class BoatTransport implements Transport{

	@Override
	public void deliver() {
		System.out.println("Boat transport is delivering products");		
	}

}
