package ru.clevertec.homework01;

import ru.clevertec.homework01.logistic.AirLogistic;
import ru.clevertec.homework01.logistic.BoatLogistic;
import ru.clevertec.homework01.logistic.CarLogistic;
import ru.clevertec.homework01.logistic.Logistic;

public class Git {
    public static void main(String[] args) {
		System.out.println("Here we starting developing process with fixed bug!");
		Logistic carLogistic = new CarLogistic();
		Logistic boatLogistic = new BoatLogistic();
		Logistic airLogistic = new AirLogistic();
		
		carLogistic.organizeDelivery();
		boatLogistic.organizeDelivery();
		airLogistic.organizeDelivery();	
	}
}