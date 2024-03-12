package week04.question01;

public class Yusra {
    /*
    Method: Frequency of Charcatesd
    Write a return method that can find the frequency of characters
    Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static void frequencyOfChar(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            result += str.charAt(i) + "" + count;
            i += count - 1;
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        frequencyOfChar("AAABBCDD");
    }
}
