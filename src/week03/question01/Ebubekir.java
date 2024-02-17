package week03.question01;

public class Ebubekir {

    public static void main(String[] args) {


        System.out.println(isPrime(7));


    }


    public static boolean isPrime(int number) {

        if(number <2){

            return false;

        }

        for (int i = 2; i< number; i++){

            if(number%i == 0){

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
<<<<<<< HEAD
=======

>>>>>>> origin/master

