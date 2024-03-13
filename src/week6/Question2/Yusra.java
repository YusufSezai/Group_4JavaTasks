package week6.Question2;

public class Yusra {
    public static int findMaximum(int[] arr) {
        // Step 2: Initialize max to the first element of the array
        int max = arr[0];

        // Step 3: Iterate through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // Step 4: Compare the current element with max
            if (arr[i] > max) {
                // Step 5: Update max if current element is greater
                max = arr[i];
            }
        }

        // Step 6: Return the maximum number
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = { 5, 108, 3, 8, 15 };
        int maxNumber = findMaximum(numbers);
        System.out.println("The maximum number is: " + maxNumber);
    }
}
    /*
    Find Maximum:
  Write a method that can find the maximum number from an int Array.
     */