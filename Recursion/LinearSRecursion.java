

public class LinearSRecursion {
    public static boolean LinearSearch(int arr[], int target, int index) {
        if (index == -1) {
            return false;
        }
        if (target == arr[index]) {
            return true;
        } else {
            return LinearSearch(arr, target, index - 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int target = 0;
        if (LinearSearch(arr, target, arr.length - 1)) {
            System.out.println("Element is present");
        } else {
            System.out.println("Element is not present");
        }

    }
}
