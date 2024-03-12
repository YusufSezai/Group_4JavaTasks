package week05.question02;

public class Yusra {

    public static void main(String[] args) {
        reverse("ABCD");
    }

    public static void reverse(String input) {
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("reversed = " + reversed);
    }
}
/*
    Write a return method that can reverse String
    Ex: Reverse("ABCD"); ==> DCBA
 */