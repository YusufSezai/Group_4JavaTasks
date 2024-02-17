package week02.question03;

public class Ebubekir {


    public static void main(String[] args) {

        printNumbers(31);

    }



    public static void PrintNumbers(int N){

        for (int i = 1; i<= N; i++){

            String result = "";

            if(i%2 == 0){

                result += "codility";
            }

            if(i%3 == 0){

                result += "Test";
            }

            if(i%5 == 0){

                result += "Coders";

            }

            if(i%6 == 0){

                result += "CodilityTest";
            }

            if(i%30 == 0){
                result+= "CodilityTestCoders";
            }

            if(result.equals("")){

                System.out.println(result);

            }else{
                System.out.println(i);
            }

        }


        /*

        Numbers -- print consecutive numbers

            Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order. For example, numbers divisible by both 2 and 3 should be replacée by CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.

            For example, here is the output for N = 24:
            1
            Codility
            Test
            Codility
            Coders
            CodilityTest
            7
            Codility
            Test
            Codi1ityCoders
            11
            CodilityTest
            13
            Codility
            TestCoders
            Codility
            17


         */


    }













    public static void printNumbers(int N) {
        for (int i = 1; i <= N; i++) {
            String result = "";

            if (i % 2 == 0) result += "Codility";
            if (i % 3 == 0) result += "Test";
            if (i % 5 == 0) result += "Coders";

            if (result.equals("")) {
                System.out.println(i);
            } else {
                System.out.println(result);
            }
        }
    }


}
