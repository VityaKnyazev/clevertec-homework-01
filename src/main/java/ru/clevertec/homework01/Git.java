package ru.clevertec.homework01;

import ru.clevertec.homework01.consumer.ParcelConsumer;
import ru.clevertec.homework01.logistic.manager.LogisticManager;
import ru.clevertec.homework01.logistic.manager.Manager;
import ru.clevertec.homework01.producer.GoodProducer;
import ru.clevertec.homework01.producer.WaterProducer;

public class Git {
	public static void main(String[] args) {
		System.out.println("Development process started from app version 1.1");
		Manager logisticManager1 = new LogisticManager(new GoodProducer(), new ParcelConsumer());
		Manager logisticManager2 = new LogisticManager(new WaterProducer(), new ParcelConsumer());
		
		logisticManager1.manage();
		logisticManager2.manage();
	}
}