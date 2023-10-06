package ru.clevertec.knyazev;

public interface Calculation {

    /**
     *
     * Get sum of two integer values
     *
     * @param a Integer value
     * @param b Integer value
     * @return sum of a and b
     */
    Integer getSum(Integer a, Integer b);

    /**
     *
     * Get subtract of two integer values
     *
     * @param a Integer value
     * @param b Integer value
     * @return subtract operation of a minus b
     */
    Integer getSubtract(Integer a, Integer b);

}
