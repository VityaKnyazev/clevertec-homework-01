package ru.clevertec.knyazev;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.println("Hello world!");

        System.out.println("Starting developing process!");

        var a = 1;
        var b = 1;

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<Integer> result = executor.submit(() -> {
            Integer sum = 0;

            for (int i = 0; i < 10; i++) {
                sum += getSum(a, b);
            }

            return sum;
        });

        executor.shutdown();

        System.out.println(result.get());

    }

    private static Integer getSum(Integer a, Integer b) {
        return a + b;
    }
}
