package week6.Question3;

public class Yusra {
    public static int sumOfDigits(String str) {
        // Step 2: Initialize sum to 0
        int sum = 0;

        // Step 3: Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Step 4: Check if the character is a digit
            if (Character.isDigit(str.charAt(i))) {
                // Step 5: Convert the character to an integer and add it to the sum
                sum += Character.getNumericValue(str.charAt(i));
            }
        }

        // Step 6: Return the sum of digits
        return sum;
    }

    public static void main(String[] args) {
        String input = "A7v15";
        int sum = sumOfDigits(input);
        System.out.println("The sum of digits in the string is: " + sum);
    }

}
    /*
    Sum of digits in a string:
  Write a method that can return the sum of the digits in a string.

  Ex: "A3v15" = > 3 + 1 + 5 = 9
        return 9
     */