package week05.question01;

public class Emel {
    //Write a return  method that can find the unique characters from the String
    //    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";

    public static void main(String[] args) {

        System.out.println(Unique("AAABBBCCCDEF"));
    }
    public static String Unique(String input){

        String result ="";

        for (int i = 0; i < input.length(); i++) {
            char each = input.charAt(i);

            if (input.indexOf(each) == input.lastIndexOf(each)){
            /*
                if first index and last index of a character is same
                that means there's only one of that character exist in the String
             */
                result += each;
            }

        }
        return result;
    }
}
