package week01.question02;

public class Yusra {

    public static void main(String[] args) {
        divide(20, 5);
    }

    public static void divide(int n1, int n2){

        int count = 0;

        String result = n1 + "/" + n2 + " = ";

        while (n1 >= n2){
            n1 -= n2;
            count++;
        }
        System.out.println(result + count + " with remainder " + n1);
    }
}
/*
2. Numbers - - Divide without / operator
Write a method that can divide two numbers without using division operator
 */
