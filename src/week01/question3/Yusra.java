package week01.question3;

public class Yusra {
    public static void main(String[] args) {
        FINRA();
    }



    public static void FINRA(){

        String result = "";

        for (int i = 1; i <= 30 ; i++) {

            if (i % 3 == 0 && i % 5 == 0){
                result += "FINRA";
            }else if (i % 3 == 0){
                result +="FIN ";
            }else if (i % 5 == 0){
                result += "RA ";
            }else {
                result += i + " ";
            }
        }
        System.out.println(result);


    }
}
/*
3. FINRA :
Write a method which prints out the numbers from 1 to 30, but print "FIN" instead of numbers for multiples of 3,
 "RA" instead of numbers for numbers that are multiples of 5, and a multiple of both 3 and 5 for "FINRA" instead
 of the number.
 */

