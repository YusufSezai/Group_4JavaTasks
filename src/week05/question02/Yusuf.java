package week05.question02;

public class Yusuf {
    public static void main(String[] args) {


        String str = "ABCD";

        String result = "";


        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }
        System.out.println("result = " + result);

    }





}
/*
    Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA
     */