package ArrayList;

import java.util.ArrayList;

public class syntax {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Add
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(1,34);

        // System.out.println(list);
        // for (int i = 0; i < list.size(); i++) {
        //     System.out.print(list.get(i) + " ");
        // }

        // Get

        int elem = list.get(1);
        System.out.println(elem);

        // Remove
        // list.remove(2);

        // Set Element
        // list.set(0, 10);
        // System.out.println(list);

        // Contains
        // list.contains(10);
        // System.out.println(list.contains(10));

        // Size
        // System.out.println(list.size());


        






    }
}