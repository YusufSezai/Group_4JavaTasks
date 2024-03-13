package week05.question01;

public class Yusra {

    public static void main(String[] args) {
        unique("AAABBBCCCDEF");
    }

    public static void unique(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < str.length(); j++) {
                if (i != j && currentChar == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }


            if (isUnique) {
                result += currentChar;
            }
        }

        System.out.println("result = " + result);
    }
}
/*
    Write a return method that can find the unique characters from the String
    Ex: unique("AAABBBCCCDEF"); ==> "DEF"
 */