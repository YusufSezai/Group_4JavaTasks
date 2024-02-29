package week05.question01;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Leena {
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




