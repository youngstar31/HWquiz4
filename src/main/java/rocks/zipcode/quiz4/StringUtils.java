package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        char middle = string.charAt(string.length() / 2);
        return middle;
    }

    public static String capitalizeMiddleCharacter(String str) {
        String output = "";
        for (int index = 0; index < str.length(); index++) {
            if (index == str.length() / 2) {
                char x = Character.toUpperCase(str.charAt(index));
                output += x;
            } else {
                output += str.charAt(index);
            }
        }

        return output;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        int Middle = str.length();
        String output = "";
        for (int c = 0; c < Middle; c++) {
            if (c == Middle / 2) {
                char x = Character.toLowerCase(str.charAt(c));
                output += x;
            } else {
                output += str.charAt(c);
            }
        }

        return output;
    }


    public static Boolean isIsogram(String str) {
        //isogram letter appears
        //loop through string
        //check index of letter against all other indexes all other
        Boolean answer = true;
        for (int index = 0; index < str.length(); index++) {
            for (int index2 = index + 1; index2 < str.length(); index2++) {
                if (String.valueOf(str.charAt(index)).equals(String.valueOf(str.charAt(index2)))) {
                    //String.valueOf(str.charAt(index))
                    answer = false;

                }

            }
        }
        return answer;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        Boolean consecutive = false;
        for (int index = 1; index < str.length() - 1; index++) {
            if (str.charAt(index) == str.charAt(index + 1)) {
                consecutive = true;
            }


        }

        return consecutive;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {

        for (int index = 0; index < str.length(); index++) {
            char charac1 = str.charAt(index);
            char charac2 = ' ';

            if (index + 1 < str.length()) {
                charac2 = str.charAt(index + 1);

            }
            if (charac1 == charac2) {
                String oldChar = String.valueOf(charac1);
                str = str.replace(oldChar, "");
            }
        }
        return str;
    }

    public static String invertCasing(String str) {
        String output = "";
       for(int index = 0; index < str.length(); index++){
           char characterAtIndex = str.charAt(index);
           if (Character.isUpperCase(characterAtIndex)){
              output += str.valueOf(Character.toLowerCase(characterAtIndex));
           } else {
              output += str.valueOf(Character.toUpperCase(characterAtIndex));
           }
       }
        return output;

    }

}