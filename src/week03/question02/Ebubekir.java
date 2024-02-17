package week03.question02;

public class Ebubekir {

    public static void main(String[] args) {
        System.out.println(ReverseNegativeNumber(-35));

    }

    public static int ReverseNegativeNumber(int number) {
        // Directly return the number if it is not negative
        if (number >= 0) {
            return number;
        }

        // Convert the number to a string
        String numberAsString = String.valueOf(number);
        String reversed = "";


        for (int i = numberAsString.length() - 1; i > 0; i--) {
            reversed += numberAsString.charAt(i);
        }

        // Convert the reversed string back to an integer and make it a negative number by doin *-1
        int reversedAsNumber = Integer.parseInt(reversed) * -1;

        return reversedAsNumber;
    }
}
    /*
    Numbers -- Reverse Negative Number
    Write a return method that can reverse digits of a negative number and return it as int
    input: -35  output: -53
*/






