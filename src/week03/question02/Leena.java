package week03.question02;

public class Leena {
    /*Numbers -- Reverse Negative Number
      Write a return method that can reverse digits of a negative number and return it as int
      input: -123  output: -321

       */
    public static int reverseDigits(int number) {
        boolean isNegative = number < 0;

        if (isNegative) {
            number = Math.abs(number);
        }

        int reversedNumber = 0;
        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return isNegative ? -reversedNumber : reversedNumber;
    }
    public static int reverseDigits2(int number) {
        boolean isNegative = number < 0;

        if (isNegative) { //-53
            number = Math.abs(number); //53
        }

        String numberString = Integer.toString(number); //53
        String reversedString = "";
        for (int i = numberString.length() - 1; i >= 0; i--) {
            reversedString += numberString.charAt(i); //35
        }

        int reversedNumber = Integer.parseInt(reversedString); //35

        return isNegative ? -reversedNumber : reversedNumber;
    }
}
