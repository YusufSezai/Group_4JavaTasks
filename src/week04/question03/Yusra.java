package week04.question03;

public class Yusra {
    /*
    Method: Remove Duplicates
    Write a return method that can remove the duplicate values from the string
        Ex: removeDup("AAABBBCCC") ==> ABC
     */

    public static String removeDup(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCC"));
    }
}
