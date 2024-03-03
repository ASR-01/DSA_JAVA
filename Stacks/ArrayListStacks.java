package Stacks;

import java.util.ArrayList;

public class ArrayListStacks {
    public static class Stack {
        ArrayList<Integer> list = new ArrayList<>();

        boolean isEmpty() {
            return list.size() == 0;
        }

        void push(int val) {
            list.add(val);
        }

        int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.size() - 1;
            list.remove(list.size() - 1);
            return top;
        }

        int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }

    }

    public static void main(String[] args) {
        Stack ll = new Stack();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(4);
        while (!ll.isEmpty()) {
            System.out.println(ll.peek());
            ll.pop();
        }
    }
}
