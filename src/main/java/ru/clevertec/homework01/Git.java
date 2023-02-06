package ru.clevertec.homework01;

import ru.clevertec.homework01.logistic.AirLogistic;
import ru.clevertec.homework01.logistic.BoatLogistic;
import ru.clevertec.homework01.logistic.CarLogistic;
import ru.clevertec.homework01.logistic.Logistic;
import ru.clevertec.homework01.logistic.manager.LogisticManager;
import ru.clevertec.homework01.logistic.manager.Manager;
import ru.clevertec.homework01.producer.GoodProducer;
import ru.clevertec.homework01.producer.WaterProducer;

public class Git {
	public static void main(String[] args) {
		Logistic carLogistic = new CarLogistic(new GoodProducer());
		Logistic boatLogistic = new BoatLogistic(new WaterProducer());
		Logistic airLogistic = new AirLogistic(new GoodProducer());

		carLogistic.organizeDelivery();
		boatLogistic.organizeDelivery();
		airLogistic.organizeDelivery();

		Manager logisticManager = new LogisticManager(null, null);
	}
}