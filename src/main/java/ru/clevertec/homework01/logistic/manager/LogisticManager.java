package ru.clevertec.homework01.logistic.manager;

import java.util.ArrayList;
import java.util.List;

import ru.clevertec.homework01.consumer.Consumer;
import ru.clevertec.homework01.logistic.AirLogistic;
import ru.clevertec.homework01.logistic.BoatLogistic;
import ru.clevertec.homework01.logistic.CarLogistic;
import ru.clevertec.homework01.logistic.Logistic;
import ru.clevertec.homework01.producer.Producer;


public class LogisticManager implements Manager {
	private List<Logistic> logistics;

	public LogisticManager(Producer producer, Consumer consumer) {
		createLogistic(producer, consumer);
	}

	@Override
	public void manage() {
		logistics.forEach(logistic -> logistic.organizeDelivery());
	}
	
	private void createLogistic(Producer producer, Consumer consumer) {
		logistics = new ArrayList<>() {
			private static final long serialVersionUID = 125843589L;

		{
			add(new CarLogistic(producer, consumer));
			add(new AirLogistic(producer, consumer));
			add(new BoatLogistic(producer, consumer));
		}};
	}

}
