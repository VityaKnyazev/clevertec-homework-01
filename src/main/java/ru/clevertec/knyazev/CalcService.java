package ru.clevertec.knyazev;

public interface CalcService {

    /**
     *
     * Calculate and return result value
     *
     * @param a int value
     * @param b int value
     * @return calculation result
     */
    Integer calculateAndReturn(int a, int b);

    /**
     *
     * Get calculation product price using product cost
     *
     * @param cost product
     * @return product price
     */
    Double getCalculationPrice(int cost);

}
