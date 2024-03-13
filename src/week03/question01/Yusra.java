package week03.question01;

public class Yusra {
    public static void main(String[] args) {

        System.out.println(isPrime(45));
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;

    }
}
/*

    Write a method that can check if a number is prime or not

        a number is a prime number when it is only divisible by 1 and itself

        ex:
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47

 */
