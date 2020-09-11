package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {
        return Math.sqrt(value);
    }

    public static Double square(Double value) {
        return Math.pow(value, 2);
    }

    public static Double[] squareRoots(Double... value)
    {
        Double[] squareRoot = new Double[value.length];
        for(int index = 0; index < value.length; index++)
        {
            squareRoot[index] = Math.sqrt(value[index]);
        }
        return squareRoot;
    }

    public static Double[] squares(Double... values)
    {
        Double[] squares = new Double[values.length];
        for(int index = 0; index < values.length; index++)
        {
            squares[index] = Math.pow(values[index], 2);
        }
        return squares;
    }

    public static Double add(Double value1, Double value2) {
        Double sum = value1 + value2;
        return sum;
    }

    public static Double subtract(Double value1, Double value2) {
        Double answer = value1 - value2;
        return answer;
    }


    public static Double divide(Double divisor, Double dividend) {
        Double answer = divisor / dividend;
        return answer;
    }
}
