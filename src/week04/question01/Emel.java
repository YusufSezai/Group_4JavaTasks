package week04.question01;

import java.util.*;

public class Emel {
    //#Question 2 : String - Same letters
    //    Write a return method that checks if a string is built out of the same letters as another string.
    //    Ex: same("abc", "cab"); ==> true
    //      same("abc", "abb"); ==> false


    public static boolean Same(String str1, String str2){

        Set<Character> charSet1 = new TreeSet<>(); //using tree set so, the order will always be in Ascending order
        Set<Character> charSet2 = new TreeSet<>();

        for (char character : str1.toCharArray()) {//turn given str to Char[] and iterate in the loop
            charSet1.add(character);// in each loop turn add the char into TreeSet<>()
        }
        for (char character : str2.toCharArray()) {
            charSet2.add(character);
        }
        if (charSet1.equals(charSet2)){ //compare
            return true; //if the sets are equal
        }
        return false; // if not
    }

    public static void main(String[] args) {
        System.out.println(Same("abc", "cab"));
        System.out.println(Same("abc", "abb"));

    }














}
