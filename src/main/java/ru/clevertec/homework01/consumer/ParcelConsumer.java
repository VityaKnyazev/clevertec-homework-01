package ru.clevertec.homework01.consumer;

public class ParcelConsumer<P> implements Consumer<P> {

	@Override
	public void comsume(Object p) {
		System.out.println("Consumer got the parsel P=" + p);		
	}
}
