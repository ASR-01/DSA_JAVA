
public class Question1 {
    public static void main(String[] args) {

        // int s = 1, e = 3;
        // for (int i = s; i <= e; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // int arr[] = { 5, 3, -1, 8 };

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i; j < arr.length; j++) {
        //         for (int k = i; k <= j; k++) {

        //             System.out.print(arr[k] + " ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for (int i = 0; i < arr.length; i++) {
        // int sum = 0;
        // for (int j = i; j < arr.length; j++) {
        // sum+= arr[j];
        // System.out.print(sum + " ");
        // }
        // System.out.println();
        // }

        // prefix Sum Approach

        // int arr[] = { 5, 3, -1, 8 };
        // int prefixSum[] = new int[arr.length];
        // prefixSum[0] = arr[0];
        // for (int i = 1; i < arr.length; i++) {
        // prefixSum[i] = prefixSum[i - 1] + arr[i];
        // }

        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i; j < arr.length; j++) {
        // if (i == 0) {
        // System.out.print(prefixSum[j] + " ");
        // } else {
        // System.out.print(prefixSum[j] - prefixSum[i - 1] + " ");
        // }
        // }
        // System.out.println();
        // }
        // int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i; j < arr.length; j++) {
        // if (i == 0) {
        // sum += prefixSum[j];
        // } else {
        // sum += prefixSum[j] - prefixSum[i - 1];
        // }
        // }
        // }
        // System.out.println(sum);

        // Contribution Method;
        int arr[] = { 5, 3, -1, 8 };
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
        int occ = (i + 1) * (n - i);
        ans += (occ * arr[i]);
        }
        System.out.println(ans);

    }
}
