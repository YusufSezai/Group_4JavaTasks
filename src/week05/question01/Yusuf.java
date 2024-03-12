package week05.question01;

public class Yusuf {


    public static void main(String[] args) {
        String str = "AAABBBCCCDEF";

        String unique = "";


        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);

            if (str.indexOf(temp) == str.lastIndexOf(temp)) {
                unique += temp;
            }

        }

        System.out.println("unique = " + unique);


    }






}
/*
    Write a return  method that can find the unique characters from the String
    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */