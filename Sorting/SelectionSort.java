package Sorting;

import java.util.ArrayList;

public class SelectionSort {
    public static void main(String[] args) {

        // Through Array
        int arr[] = { 1, 2, 5, 3, 4 };
        // In Ascending Order
        // for (int i = 0; i < arr.length - 1; i++) {
        // int min = i;
        // for (int j = i+1; j < arr.length; j++) {
        // if (arr[j] < arr[min]) {
        // min = j;
        // }

        // }

        // if (min != i) {
        // int temp = arr[i];
        // arr[i] = arr[min];
        // arr[min] = temp;
        // }
        // }
        // In Descending Order

        for (int i = 0; i < arr.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }

            }

            if (max != i) {
                int temp = arr[i];
                arr[i] = arr[max];
                arr[max] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(2);
        // list.add(1);
        // list.add(5);
        // list.add(6);
        // list.add(7);

        // In Ascending Order
        // for (int i = 0; i < list.size() - 1; i++) {
        // int minIndex = i;
        // for (int j = i + 1; j < list.size(); j++) {
        // if (list.get(j) < list.get(minIndex)) {
        // minIndex = j;
        // }
        // }

        // if (minIndex != i) {
        // int temp = list.get(i);
        // list.set(i, list.get(minIndex));
        // list.set(minIndex, temp);
        // }

        // }
        // In Descending Order

        // for (int i = 0; i < list.size() - 1; i++) {
        // int maxIndex = i;
        // for (int j = i + 1; j < list.size(); j++) {
        // if (list.get(j) > list.get(maxIndex)) {
        // maxIndex = j;
        // }
        // }

        // if (maxIndex != i) {
        // int temp = list.get(i);
        // list.set(i, list.get(maxIndex));
        // list.set(maxIndex, temp);
        // }

        // }

        // System.out.println(list);
    }
}
