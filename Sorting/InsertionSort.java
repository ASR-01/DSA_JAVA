package Sorting;

import java.util.ArrayList;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        // In Ascending Order

        // for (int i = 0; i < arr.length - 1; i++) {
        // for (int j = 0; j < arr.length - 1; j++) {
        // int temp = arr[j + 1];
        // if (arr[j] > arr[j + 1]) {
        // arr[j + 1] = arr[j];
        // arr[j] = temp;
        // }

        // }
        // }

        // In Descending Order

        // for (int i = 0; i < arr.length - 1; i++) {
        // for (int j = 0; j < arr.length - 1; j++) {
        // int temp = arr[j + 1];
        // if (arr[j] < arr[j + 1]) {
        // arr[j + 1] = arr[j];
        // arr[j] = temp;
        // }

        // }
        // }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(6);
        list.add(7);

        // In Ascending-Order
        // for (int i = 0; i < list.size()-1; i++) {

        //     for (int j = 0; j < list.size() - 1; j++) {
                
        //         int temp = list.get(j+1);
        //         if (list.get(j)>list.get(j+1)) {
        //             list.set(j+1, list.get(j));
        //             list.set(j, temp);
        //         }

        //     }

        // }
        // In Descending Order

        for (int i = 0; i < list.size()-1; i++) {

            for (int j = 0; j < list.size() - 1; j++) {
                
                int temp = list.get(j+1);
                if (list.get(j)<list.get(j+1)) {
                    list.set(j+1, list.get(j));
                    list.set(j, temp);
                }

            }

        }

        System.out.println(list);
    }
}
