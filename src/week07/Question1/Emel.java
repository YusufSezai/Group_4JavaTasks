package week07.Question1;

/*
==> Question 01- FindMinimum

	Write a method that can find the minimum number from an int Array

	Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
 */
public class Emel {

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6}; // ==> 6
        MinNumFromArray(arr);
        System.out.println(MinNumFromArray2(arr));
    }
    public static void MinNumFromArray(int[] arr){

        int minNumber = arr[0];

        for (int each : arr) {
            if (each<minNumber){
                minNumber=each;
            }
        }
        System.out.println(minNumber);
    }
    public static int MinNumFromArray2(int[] arr){

        int minNumber = arr[0];

        for (int each : arr) {
            if (each<minNumber){
                minNumber=each;
            }
        }
        return minNumber;
    }

}
