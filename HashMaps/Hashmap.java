import java.util.HashMap;
import java.util.HashSet;

public class Hashmap {
    public static void main(String[] args) {
        // HashMap<Integer, Integer> mp = new HashMap<>();
        // mp.put(1, 10);
        // mp.put(2, 2);
        // mp.put(3, 3);
        // mp.put(4, 4);
        // mp.put(5, 5);

        // for (Map.Entry<Integer, Integer> Val : mp.entrySet()) {
        // System.out.print(Val.getValue() + " ");
        // System.out.print(val + " ");
        // }

        // for (int val : mp.keySet()) {
        // System.out.println(mp.get(val));
        // }

        // int arr[] = { 2, 2, 2, 5, 6, 7, 8, 8, 3, 4, 7, 8 };
        // int query[] ={2,5,9,6,8};
        // HashMap<Integer, Integer> mp = new HashMap<>();

        // for (int i = 0; i < arr.length; i++) {
        // if (mp.containsKey(arr[i]) == true) {
        // int temp = mp.get(arr[i]);
        // mp.put(arr[i], temp + 1);
        // } else {
        // mp.put(arr[i], 1);
        // }
        // }

        // // for (int val : mp.keySet()) {
        // // System.out.print(mp.get(val) + " ");
        // // }
        // // System.out.println(mp.get(8));

        // for (int j = 0; j <query.length; j++) {
        // int val = query[j];

        // if(mp.containsKey(val)==true){
        // System.out.print(mp.get(val)+" ");
        // }
        // else{
        // System.out.print(0 + " ");
        // }
        // }
        // int arr[] = { 1, 1, 2, 2, 3, 3, 5 };
        // HashMap<Integer, Integer> mp = new HashMap<>();

        // for (int i = 0; i < arr.length; i++) {
        // Boolean unique = false;
        // for (int j = 0; j < arr.length; j++) {
        // if (i != j && arr[i] == arr[j]) {
        // unique = true;
        // break;
        // }

        // }
        // if (!unique) {
        // System.out.print(arr[i] + " ");
        // break;
        // }
        // }

        // int arr[] = { 1, 1, 2, 3, 3, 5 };
        // HashMap<Integer, Integer> mp = new HashMap<>();

        // for (int i = 0; i < arr.length; i++) {
        // if (mp.containsKey(arr[i]) == true) {
        // int temp = mp.get(arr[i]);
        // mp.put(arr[i], temp + 1);
        // } else {
        // mp.put(arr[i], 1);
        // }
        // }
        // System.out.println(mp.size());
        // HashSet<Integer> set = new HashSet<>(mp.values());
        // System.out.print(set.size());
        // System.out.println(mp.values());
        // System.out.println(mp.size());
        // for (int val : mp.keySet()) {
        // if (mp.get(val) == 1) {
        // System.out.print(val);
        // break;
        // }
        // }

        int arr[] = { 1, 1, 2, 3, 3, 5 };

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);

        }

        for (int val : set) {
            System.out.print(val + "  ");
        }

    }
}
