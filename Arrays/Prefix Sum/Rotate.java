public class Rotate {
    public static void main(String[] args) {
        int arr[] = { -1, -100, 3, 99 };
        int k = 2;
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        i = 0;
        j = k - 1;

        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        i = k;
        j = arr.length - 1;

        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for (int val : arr) {
            System.out.print(val + " ");
        }

    }
}
