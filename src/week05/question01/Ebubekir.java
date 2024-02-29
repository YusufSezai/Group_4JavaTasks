package week05.question01;

public class Ebubekir {

      /*
    Write a return  method that can find the unique characters from the String
    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */


    public static String unique(String str){

        String result = "";

        for (int i = 0; i<str.length(); i++){

            char currentChar = str.charAt(i);

            if(str.indexOf(currentChar) == str.lastIndexOf(currentChar)){

                result += currentChar;


            }
        }


        return result;
    }



}

