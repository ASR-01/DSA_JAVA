import java.util.*;

public class BruteForce {
    public static void main(String[] args) {
        int arr[] = { 4, 1, 6, -2, 7 };
        ArrayList<Integer> mpp = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += arr[j];
            }
            mpp.add(sum);
        }

        for (int val : mpp) {
            System.out.print(val + " ");
        }

    }
}
