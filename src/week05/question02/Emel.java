package week05.question02;

public class Emel {
    // Write a return method that can reverse  String
    //    Ex: Reverse("ABCD"); ==> DCBA

    public static String Reverse(String str){

        String reversed ="";
        for (int i = str.length()-1; i >= 0 ; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(Reverse("ABCD"));
    }
}
