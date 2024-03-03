
import java.util.ArrayList;

public class TargetSum {
    public static void TargetSS(int arr[], int sum, int index, int n, ArrayList<Integer> ans) {
        if (index == n) {
            // System.out.print(sum + " ");

            ans.add(sum);
            return;
        }
        TargetSS(arr, sum, index + 1, n, ans);

        TargetSS(arr, sum + arr[index], index + 1, n, ans);

    }

    public static boolean TargetSSS(int arr[], int sum, int index, int target) {
        if (sum == target) {
            return true;
        }

        if (index == arr.length) {
            return false;
        }

        return TargetSSS(arr, sum + arr[index], index + 1, target) || TargetSSS(arr, sum, index + 1, target);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int target = 6;
        // boolean Found = false;

        // ArrayList<Integer> ans = new ArrayList<>();
        // TargetSS(arr, 0, 0, arr.length, ans);
        boolean TT = TargetSSS(arr, 0, 0, target);
        if (TT == true) {
            System.out.println("True");
        } else {
            System.out.println("False");

        }

        // System.out.println(ans);

        // for (int i = 0; i < ans.size(); i++) {
        // if (ans.get(i) == target) {
        // Found = true;
        // break;
        // }
        // }

        // if (Found == true) {
        // System.out.println("True");
        // } else {
        // System.out.println("False");

        // }
    }

}
