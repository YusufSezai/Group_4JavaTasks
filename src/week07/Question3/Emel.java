package week07.Question3;

import java.util.Arrays;
import java.util.TreeSet;

/*
 ==> Question 03- SortDescending

	Write a return method that can sort an int array in descending order.
	WITHOUT USING THE SORT METHOD of the Arrays class

	Ex: int[] arr = {10,20,7, 8, 90};
	arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */
public class Emel {

    public static void main(String[] args) {
        int[] arr = {10,20,7, 8, 90};
        System.out.println(Arrays.toString(SortArrayInDescendingOrder(arr)));

    }
    public static int[] SortArrayInDescendingOrder(int[] arr){

        TreeSet<Integer> sortingProcess = new TreeSet<>();

        for (int num : arr) {
            sortingProcess.add(num);
        }

        int i=sortingProcess.size()-1;

        for (int num : sortingProcess) {
            arr[i] =num;
            i--;
        }
        return arr;
    }
}
