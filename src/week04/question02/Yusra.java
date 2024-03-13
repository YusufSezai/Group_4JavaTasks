package week04.question02;

public class Yusra {
    /*
    Method: Same letters
    Write a return method that checks if a string is built out of the same letters as another string
    Ex: same("abc", "cab"); ==> true
        same("abc", "abb"); ==> false
     */

    public static boolean sameLetters(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        for (char ch : str1.toCharArray()) {
            if (str2.indexOf(ch) == -1) {
                return false;
            }
        }

        for (char ch : str2.toCharArray()) {
            if (str1.indexOf(ch) == -1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(sameLetters("abc", "cab"));
        System.out.println(sameLetters("abc", "abb"));
    }
}
