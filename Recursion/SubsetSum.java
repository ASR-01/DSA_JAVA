

import java.util.ArrayList;

public class SubsetSum {
    public static void SSum(int arr[], int sum, int index, int n, ArrayList<Integer> ans,
            ArrayList<ArrayList<Integer>> mainList, ArrayList<Integer> list) {
        if (index == n) {
            // System.out.print(sum + " ");
            mainList.add(new ArrayList<>(list));
            ans.add(sum);
            return;
        }
        SSum(arr, sum, index + 1, n, ans, mainList, list);

        list.add(arr[index]);
        SSum(arr, sum + arr[index], index + 1, n, ans, mainList, list);
        list.remove(list.size()-1);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        SSum(arr, 0, 0, arr.length, ans, mainList, list);

        // System.out.println(ans);
        System.out.println(mainList + "-->" + ans);
       
    }
}
