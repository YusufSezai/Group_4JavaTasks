package week6.Question2;


public class Emel {
    /*
   Find Maximum:
 Write a method that can find the maximum number from an int Array.
    */
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {9, 40, 20, 10, 24};
        System.out.println("maximum number in arr1 = " + maxNumArr(arr1)); //expected : 9
        System.out.println("maximum number in arr2 = " + maxNumArr(arr2)); // expected 40

        maxNumArr2(arr1); //expected : 9
        maxNumArr2(arr2); // expected 40
    }

    //return method:
    public static int maxNumArr(int[] array) {

        int max = array[0]; //set a random number from given array to be temporary maximum number

        for (int i : array) {
            if (i > max) { // if element at index number "i" is bigger than the temporary given max number
                max = i; //set new maximum number at index number "i"
            }
        }
        return max; // return the finalized maximum number

    }

    //void method:
    public static void maxNumArr2(int[] array) {

        int max = array[0]; //set a random number from given array to be temporary maximum number

        for (int i : array) {
            if (i > max) { // if element at index number "i" is bigger than the temporary given max number
                max = i; //set new maximum number at index number "i"
            }
        }
        System.out.println("max number = " + max); // return the finalized maximum number

    }

}
