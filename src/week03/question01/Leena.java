package week03.question01;

public class Leena {
    /*

 Numbers -- JavaTasks.Week3.Question1.PrimeNumber
 Write a method that can check if a number is prime or not

  */
    public static void main(String[] args) {
        isPrime(4);

    }
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

}
