package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        int middle = string.length() / 2;
        char answer = string.charAt(middle);
        return answer;
    }

    public static String capitalizeMiddleCharacter(String str) {
        int middle = str.length() / 2;
        String answer = "";
        char middleChar = str.charAt(str.length()/2);
        for (int index = 0; index < str.length(); index++)
            if (index == str.length() / 2) {
                answer += String.valueOf(middleChar).toUpperCase();
            }
            else{
                answer += str.charAt(index);
            }
        return answer;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        int middle = str.length() / 2;
        String answer = "";
        char middleChar = str.charAt(str.length()/2);
        for (int index = 0; index < str.length(); index++)
            if (index == str.length() / 2) {
                answer += String.valueOf(middleChar).toLowerCase();
            }
            else{
                answer += str.charAt(index);
            }
        return answer;
    }

    public static Boolean isIsogram(String str) {
        Boolean answer = true;
        for(int index = 0; index < str.length(); index++)
            for (int index1 = index + 1; index1 < str.length(); index1++)
            {
                if (String.valueOf(str.charAt(index)).contains(String.valueOf(str.charAt(index1))))
                {
                    answer = false;
                }
            }
        return answer;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        Boolean answer = false;
        for(int index = 0; index < str.length(); index++) {
            if (index < str.length()-1)
            {
                if(str.charAt(index) == str.charAt(index + 1))
                {
                    answer = true;
                }
            }
        }
        return answer;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        String answer = "";
        for(int index = 0; index < str.length(); index++) {
            if (index < str.length()-1)
            {
                if(str.charAt(index) == str.charAt(index + 1))
                {
                    index++;
                }
                else
                {
                    answer += str.charAt(index);
                }
            }
            else
            {
                answer += str.charAt(index);
            }
        }
        return answer;
    }


    public static String invertCasing(String str) {
        String answer = "";
        for(int index = 0; index < str.length(); index++)
        {
            char currentCharacter = str.charAt(index);
            if(Character.isUpperCase(currentCharacter))
            {
                answer += String.valueOf(currentCharacter).toLowerCase();
            }
            else if(Character.isLowerCase(currentCharacter))
            {
                answer += String.valueOf(currentCharacter).toUpperCase();
            }
            else
                {
                answer += currentCharacter;
                }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(invertCasing("ZzZ"));
    }
}