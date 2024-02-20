package week03.question02;

public class Yusuf {
    public static void main(String[] args) {
        System.out.println(reverse(-583));
        reverseMe(583);
        reverseMe(-583);
    }

    public static int reverse(int n) {
        int reversed = 0;
        boolean isNegative = n < 0;

        if (isNegative) {
            n = Math.abs(n); // absolute value of the given number
        }

        while (n > 0) {
            int digit = n % 10; // 3 -> 8 -> 5              // reversed = (reversed * 10) + 3
            reversed = reversed * 10 + digit;               //     3    = (   3     * 10) + 8
            n /= 10; // 583 -> 58 -> 5                      //    38    = (  38     * 10) + 5
        }                                                   //   385

        if (isNegative) {
            return -reversed;
        }
        return reversed;
    }

    public static void reverseMe(int n) {
        boolean isNegative = n < 0;
        String reversed = "";

        String[] number = String.valueOf(n).split("");
        for (int i = number.length -1 ; i >= 0 ; i--) {
            reversed += number[i];
        }
        if (isNegative) {
            reversed = "-" + reversed.substring(0,reversed.length()-1);
        }
        System.out.println(reversed);

    }


}
/*
Numbers -- Reverse Negative Number
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */