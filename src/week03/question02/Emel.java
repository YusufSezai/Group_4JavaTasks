package week03.question02;

public class Emel {
    public static int ReverseNegativeNumber(int num){

        if (num>=0){
            System.out.println("INVALID ENTRY \"" + num + "\" !! Provide a negative number.");
            return 0;
        }else if (Math.abs(num)<= 9 && Math.abs(num)>0){
            return num;
        }

        String str = Math.abs(num)+"";
        String reversedStr="-";

        for (int i = str.length()-1 ; i >=0 ; i--) {
            reversedStr += str.charAt(i);
        }
        return Integer.valueOf(reversedStr);
    }
}
/*
Numbers -- Reverse Negative Number
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */
