package week6.Question2;

public class Bianca {

    /*
    Find Maximum:
  Write a method that can find the maximum number from an int Array.
     */

    public static int maxNumber(int[] array){
        int max =array[0];

        for (int each:array) {
            if(each > max){
                max = each;

            }

        }

        return max;

    }


    public static void main(String[] args) {
        int [] arr = {1,6,9,4,7};
        System.out.println(maxNumber(arr));
    }



}
