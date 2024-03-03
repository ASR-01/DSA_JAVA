package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {
    public static void main(String[] args) {

        // int arr[] = { 2, 3, 4, 5, 3, 9, 8 };
        // for reverse
        Integer arr[] = { 2, 3, 4, 5, 3, 9, 8 };

        // Arrays.sort(arr);

        // Arrays.sort(arr,1,4);
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
