package ru.clevertec.knyazev;

public class Calculator implements Calculation {

    @Override
    public Integer getSum(Integer a, Integer b) {
        return a+b;
    }

    @Override
    public Integer getSubtract(Integer a, Integer b) {
        return a-b;
    }

    @Override
    public Long getMultiply(Integer a, Integer b) {
        return (long) a*b;
    }

    @Override
    public Double getDivide(Integer a, Integer b) {
        return (double) a/b;
    }

}
