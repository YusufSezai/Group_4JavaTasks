package week05.question02;

public class Ebubekir {

     /*
    Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA
     */


    public static String reverse(String str){

        String result = "";

        for (int i = str.length()-1; i>=0; i--){

            char ch = str.charAt(i);

            result += ch;
        }

        return result;
    }


    public static void main(String[] args) {

        System.out.println(reverse("ABCD"));
    }
}

