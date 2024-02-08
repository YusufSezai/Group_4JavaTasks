package week01.question01;

public class Tijana {
    public static void main(String[] args) {

            int number = 100;

            String divisibleBy15 = "";
            String divisibleBy3 = "";
            String divisibleBy5 = "";

            for (int i = 0; i <= number; i++) {

                if (i % 15 == 0){
                    divisibleBy15 += i + " ";
                }
                if (i % 5 == 0){
                    divisibleBy5 += i + " ";
                }
                if (i % 3 == 0){
                    divisibleBy3 += i + " ";
                }
            }



            System.out.println(divisibleBy15);
            System.out.println(divisibleBy5);
            System.out.println(divisibleBy3);


        }}


