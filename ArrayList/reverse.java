package ArrayList;

import java.util.ArrayList;

public class reverse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int s = 0;
        int e = list.size() - 1;

        while (s < e) {

            int temp = list.get(s);
            list.set(s, list.get(e));
            list.set(e, temp);
            s++;
            e--;

        }
        System.out.print(list);
        // for (int val : list) {
        // System.out.print(val + " ");
        // }

    }
}
