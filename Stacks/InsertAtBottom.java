package Stacks;

import java.util.Stack;

public class InsertAtBottom {
    public static void Method1InsertAtBottom(Stack<Integer> s, int x) {
        Stack<Integer> s2 = new Stack<>();

        while (!s.isEmpty()) {
            s2.add(s.pop());

        }

        s.add(x);

        while (!s2.isEmpty()) {
            s.add(s2.pop());
        }

    }


 
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        int x = 9;
        s.add(4);
        s.add(6);
        s.add(7);
        s.add(3);
        s.add(2);
      

        Method1InsertAtBottom(s, x);
        System.out.println(s);

    }
}
