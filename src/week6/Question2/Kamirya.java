package week6.Question2;

public class Kamirya {


     /*
    Array -- Find Maximum
Write a method that can find the maximum number from an int Array
     */


    public static void main(String[] args) {
        // Example usage
        int[] num = {100, 15, 0, 11, 3, 20, 99};
        System.out.println("Maximum number: " + findMaxNum(num));
    }



    public static int findMaxNum(int[] array) {

        // assume that the first element of the array is the max number
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // --> update max num
            }
        }

        return max;
    }

}
