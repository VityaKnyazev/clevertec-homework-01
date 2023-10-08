package ru.clevertec.knyazev;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.println("Some changes to release App v. 1.1");

        var a = 2;
        var b = 2;

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<Double> result = executor.submit(() -> {
            Calculator calculator = new Calculator();
            CalcService calcService = new CalcServiceImpl(calculator);

            Integer sum = 0;

            for (int i = 0; i < 10; i++) {
                sum += calcService.calculateAndReturn(a, b);
            }

            Double productPrice = calcService.getCalculationPrice(sum);

            return productPrice;
        });

        executor.shutdown();

        System.out.println("Calculated product price=" + result.get());

    }

}
