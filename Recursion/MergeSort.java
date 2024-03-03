

import java.util.ArrayList;

public class MergeSort {
    public static void Merge(int arr[], int s, int e, int mid) {
        ArrayList<Integer> temp = new ArrayList<>(e - s + 1);
        int left = s;
        int right = mid + 1;
       
        while (left <= mid && right <= e) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // remaining Element
        while (left <= mid) {
            temp.add(arr[left]);
            left++;

        }
        while (right <= e) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = s; i <= e; i++) {
            arr[i] = temp.get(i - s);
        }
    }

    public static void MergeSSort(int arr[], int s, int e) {
        if (s == e) {
            return;
        }
        int mid = s + (e - s) / 2;
        MergeSSort(arr, s, mid);
        MergeSSort(arr, mid + 1, e);
        Merge(arr, s, e, mid);

    }

    public static void main(String[] args) {
        int arr[] = { 6, 4, 3, 2, 4, 5, 8, 5 };
        MergeSSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
