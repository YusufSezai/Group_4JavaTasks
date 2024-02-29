package week04.question03;

public class Emel {

    // #Question 3 : String - Frequency of Characters
    //
    //    Write a return method that can find the frequency of characters
    //    Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
    public static String FrequencyOfChars(String input){

        String result ="";

        for (int i = 0; i < input.length(); i++) {

            int frequencyOfOneLetter=0;

            for (int j = 0; j < input.length(); j++) {

                if (input.charAt(i)==input.charAt(j)){
                    frequencyOfOneLetter++;
                }

            }
            if ( !(result.contains(input.charAt(i)+"") ) ){
                result += input.charAt(i)+""+frequencyOfOneLetter;
            }

        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(FrequencyOfChars("AAABBCDD")); //A3B2C1D2

    }
}
