package rocks.zipcode.quiz4.arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values)
    {
        return values[values.length/2];
    }

    public static String[] removeMiddleElement(String[] values)
    {
        String[] newArray = new String[values.length-1];
        int MiddleElement = (values.length-1) / 2;
        for(int index = 0; index < values.length-1; index++){
            if (index >= MiddleElement)
            {
                newArray[index] = values[index+1];
            }
            if (index == values.length-2)
            {
                newArray[index] = values[index+1];
            }
            else if (index < MiddleElement)
            {
                newArray[index] = values[index];
            }
        }
        return newArray;
    }

    public static String getLastElement(String[] values)
    {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values)
    {
        String answer[] = new String[values.length-1];
        for(int index = 0; index < answer.length; index++)
        {
            answer[index] = values[index];
        }
        return answer;
    }
}