

import java.util.ArrayList;

public class ArraySubsets {

    public static void printSubset(int[] ans, int len) {
        System.out.print("[");
        for (int i = 0; i < len; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(ans[i]);
        }
        System.out.println("]");
    }

    public static void Subsets(int arr[], int ans[], int i, int len) {
        if (i == arr.length) {
            printSubset(ans, len);
            return;
        }

        // Include current element
        ans[len] = arr[i];
        Subsets(arr, ans, i + 1, len + 1);

        // Exclude current element
        Subsets(arr, ans, i + 1, len);
    }

    public static void SecondMethod(int arr[], int i, ArrayList<ArrayList<Integer>> mainList, ArrayList<Integer> list) {

        if (i == arr.length) {
            ArrayList<Integer> newList = new ArrayList<>();
            newList.addAll(list);
            // System.out.print("mai huu" + newList + " ");
            mainList.add(newList);

            return;
        }

        // pick the element

        list.add(arr[i]);
        SecondMethod(arr, i + 1, mainList, list);
        // System.out.println("i am size" + list.size());
        list.remove(list.size() - 1);

        // don't pick the element
        SecondMethod(arr, i + 1, mainList, list);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        SecondMethod(arr, 0, mainList, list);
        // int[] ans = new int[arr.length];
        // Subsets(arr, ans , 0,0);

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currentList = mainList.get(i);
            for (int j = 0; j < currentList.size(); j++) {
                System.out.print(currentList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
