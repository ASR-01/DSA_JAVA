

public class BinarySearchRecursion {
    public static boolean BinarySearch(int arr[], int target, int s, int e) {
        if (s > e) {
            return false;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return true;
        } else if (arr[mid] < target) {
            return BinarySearch(arr, target, mid + 1, e);

        } else {
            return BinarySearch(arr, target, s, mid - 1);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int target = 1;

        if (BinarySearch(arr, target, 0, arr.length - 1)) {
            System.out.println("Element is present");
        } else {
            System.out.println("Element is not present");
        }

    }
}
