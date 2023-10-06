package ru.clevertec.knyazev;

public class CalcServiceImpl implements  CalcService {

    private Calculator calculator;

    public CalcServiceImpl(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public Integer calculateAndReturn(int a, int b) {
        return calculator.getSum(a, b);
    }

    @Override
    public Double getCalculationPrice(int cost) {
        return (cost * 0.2D + cost) * 2;
    }
}
