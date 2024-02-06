package week01.question01;

public class Yusra {

    public static void main(String[] args) {

        isEven0rOdd(45);

    }
    public static void isEven0rOdd(int identify){
        if (identify % 2 == 0){
            System.out.println("identify(" + identify + ") -> Even");
        }else {
            System.out.println("identify(" + identify + ") -> Odd");
        }
    }
}
/*
1. Numbers -- odd & even
Write a method which can identifies given number is even or odd

EX:
  identify(5) -> "Odd"
  identify(6) -> "Even"
 */

