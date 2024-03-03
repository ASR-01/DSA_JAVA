
public class PrintArray {
    public static void arrPrint(int arr[], int index, int n) {

        if (index == n) {
            return;
        }
        System.out.print(arr[index] + " ");
        arrPrint(arr, index + 1, n);

    }

    public static void reversePrint(int arr[], int index) {

        if (index == 0) {
            System.out.println(arr[index]);
            return;
        }
        System.out.print(arr[index] + " ");
        reversePrint(arr, index - 1);

    }

    public static int SumOfArr(int arr[], int index) {

        if (index == 0) {
            return 1;
        }
        return arr[index] + SumOfArr(arr, index - 1);

    }

    public static int MinElement(int arr[], int index) {
        if (index == 0) {
            return 1;
        }
        // return Math.min(arr[index], MinElement(arr, index - 1));
        int minOfRest = MinElement(arr, index - 1);
        if (arr[index] < minOfRest) {
            return arr[index];
        } else {
            return minOfRest;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int Min = MinElement(arr, arr.length - 1);
        System.out.println(Min);
    }
}