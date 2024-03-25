package week07.Question2;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

/*
==> Question 02- SortAscending

	Write a return method that can sort an int array in Ascending order.
	WITHOUT USING THE SORT METHOD of the Arrays class

	Ex: int[] arr = {10, 9, 8, 7};
	arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */
public class Emel {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        System.out.println(Arrays.toString(SortArrayInAscendingOrder(arr)));

    }
    public static int[] SortArrayInAscendingOrder(int[] arr){

        TreeSet<Integer> sortingProcess = new TreeSet<>();

        for (int num : arr) {
            sortingProcess.add(num);
        }

        int i=0;
        for (int num : sortingProcess) {
            arr[i] =num;
            i++;
        }
        return arr;
    }

}
