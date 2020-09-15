package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {

        return Math.sqrt(value);
    }

    public static Double square(Double value) {

        return value * value;
    }

    public static Double[] squareRoots(Double... value) {
        Double[] testArray = new Double[value.length];
        for(int index = 0; index < value.length; index++){
        Double squareRoot =  Math.sqrt(value[index]);
        testArray[index] = squareRoot;

        }

        return testArray;
    }

    public static Double[] squares(Double... values) {
        Double[] testArray = new Double[values.length];
        for (int index = 0; index < values.length; index++){
            Double square = Math.pow(values[index],2);
            testArray[index] = square;
        }

        return testArray;
    }

    public static Double add(Double value1, Double value2) {


        return value1 + value2;
    }

    public static Double subtract(Double value1, Double value2) {

        return value1 - value2;
    }


    public static Double divide(Double divisor, Double dividend) {

        return divisor / dividend;
    }
}
