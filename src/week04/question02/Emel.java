package week04.question02;

import java.util.LinkedHashSet;
import java.util.Set;

public class Emel {

    //#Question 2 : String - Remove Duplicates
    //Write a return method that can remove the duplicated values from the String
    //  Ex: removeDup("AAABBBCCC") ==> ABC

    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCC"));

    }
    public static String removeDup(String str){

        String noDuplicates="";

        Set<Character> list = new LinkedHashSet<>(); //does not accept duplicates and preserves insertion order

        for (char character : str.toCharArray()) {
            list.add(character);
        }
        for (Character ch : list) { // return Set to String
            noDuplicates += ch ;
        }
        return noDuplicates;
    }

}
