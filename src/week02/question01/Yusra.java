package week02.question01;

public class Yusra {

    public static void main(String[] args) {
        Swap(4, 10);
    }

    public static void Swap(int a, int b) {

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
 /*
    Swap Numbers

    Swap two variable' values without using a third variable
     */