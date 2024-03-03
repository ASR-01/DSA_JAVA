

public class QuickSort {
    public static int partition(int arr[], int s, int e) {
        int pos = s;
        for (int i = s; i <= e; i++) {
            if (arr[i] >= arr[e]) {
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
                pos++;
            } 
        }

        return pos-1;
    }

    public static void QuickSSort(int arr[], int s, int e) {
        if (s >= e) {
            return;
        }
        int pivot = partition(arr, s, e);
        QuickSSort(arr, s, pivot - 1);
        QuickSSort(arr, pivot + 1, e);

    }

    public static void main(String[] args) {
        int arr[] = { 6, 4, 3, 2, 4, 5, 8, 5 };
        QuickSSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
