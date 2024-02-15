package week03.question01;

import java.util.ArrayList;

public class Emel {


    public static void isPrime(int num) {

        ArrayList<Integer> divisors = new ArrayList<>();

        if (num <= 0) {
            System.out.println("INVALID ENTRY!! Negative numbers cannot be prime numbers.");
            System.out.println("Valid numbers stars from 2... ");
            return;
        } else if (num == 1) {
            System.out.println("INVALID ENTRY!! Please provide a valid number");
            System.out.println("Valid numbers stars from 2... ");
            return;
        }
        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                divisors.add(i);
            }
        }
        if (divisors.size() == 2) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is NOT a prime number");
        }

    }

    public static boolean IsPrime(int num) {
        ArrayList<Integer> divisors = new ArrayList<>();

        if (num <= 0) {
            System.out.println("INVALID ENTRY!! Negative numbers cannot be prime numbers.");
            System.out.println("Valid numbers stars from 2... ");
            return false;

        } else if (num == 1) {
            System.out.println("INVALID ENTRY!! Please provide a valid number");
            System.out.println("Valid numbers stars from 2... ");
            return false;
        }

        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                divisors.add(i);
            }
        }
        if (divisors.size() == 2) {
            return true;
        } else {
            return false;
        }

    }
}
/*

Write a method that can check if a number is prime or not

    a number is a prime number when it is only divisible by 1 and itself

	ex:
        2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47

 */

