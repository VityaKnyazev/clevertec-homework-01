package ru.clevertec.homework01.logistic.manager;

import java.util.ArrayList;
import java.util.List;

import ru.clevertec.homework01.consumer.Consumer;
import ru.clevertec.homework01.logistic.AirLogistic;
import ru.clevertec.homework01.logistic.BoatLogistic;
import ru.clevertec.homework01.logistic.CarLogistic;
import ru.clevertec.homework01.logistic.Logistic;
import ru.clevertec.homework01.producer.GoodProducer;
import ru.clevertec.homework01.producer.Producer;
import ru.clevertec.homework01.producer.WaterProducer;
import ru.clevertec.homework01.product.Product;

public class LogisticManager implements Manager {
	private List<Logistic> logistics;
	
	private Producer<?> producer;
	private Consumer consumer;
	
	LogisticManager(Producer<?> producer, Consumer consumer) {
		createLogistic();
		
		this.producer = producer;
		this.consumer = consumer;
	}

	@Override
	public void manage() {
		Product product = (Product) producer.produce();
		logistics.forEach(logistic -> logistic.organizeDelivery());		
		consumer.consume(product);
	}
	
	private void createLogistic() {
		logistics = new ArrayList<>() {
			private static final long serialVersionUID = 125843589L;

		{
			add(new CarLogistic(new GoodProducer()));
			add(new AirLogistic(new WaterProducer()));
			add(new BoatLogistic(new GoodProducer()));
		}};
	}

}
