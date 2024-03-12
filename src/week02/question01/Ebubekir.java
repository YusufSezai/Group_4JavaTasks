package week02.question01;

public class Ebubekir {

    public static void main(String[] args) {


            int a = 10;
            int b = 20;

            System.out.println("Before swap: a = " + a + ", b = " + b);

            // Swapping without a third variable

            a = a + b; // a now becomes 30
            b = a - b; // b becomes 10 (original value of a)
            a = a - b; // a becomes 20 (original value of b)

            System.out.println("After swap: a = " + a + ", b = " + b);
        }
    }






      /*
    Swap Numbers

    Swap two variable' values without using a third variable
     */
