package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 2, 3, 4 };
        // In Ascending-Order
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length - 1; j++) {
        //         if (arr[j] > arr[j + 1]) {
        //             int temp = arr[j];
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = temp;
        //         }
        //     }
        // }
        // In Descending-Order
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i-1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Through ArrayList

        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(2);
        // list.add(1);
        // list.add(5);
        // list.add(6);
        // list.add(7);

        // In Ascending-Order
        // for (int i = 0; i < list.size(); i++) {

        // for (int j = 0; j < list.size() - 1; j++) {
        // if (list.get(j) > list.get(j + 1)) {
        // int temp = list.get(j);
        // list.set(j, list.get(j + 1));
        // list.set(j + 1, temp);

        // }
        // }

        // }

        // In Descending-Order
        // for (int i = 0; i < list.size() - 1; i++) {

        // for (int j = 0; j < list.size() - i - 1; j++) {
        // if (list.get(j) < list.get(j + 1)) {
        // int temp = list.get(j);
        // list.set(j, list.get(j + 1));
        // list.set(j + 1, temp);

        // }
        // }

        // }

        // System.out.println(list);
    }
}
