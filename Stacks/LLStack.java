package Stacks;

public class LLStack {

    public static class Node {

        int val;
        Node next = null;

        Node(int val) {
            this.val = val;
        }
    }

    public static class Stack {
        Node head = null;

        boolean isEmpty() {
            return head == null;
        }

        void push(int val) {
            Node newNode = new Node(val);
            if (isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        int pop() {
            if (isEmpty()) {
                return -1;
            }

            int top = head.val;
            head = head.next;
            return top;
        }

        int peek() {
            if (isEmpty()) {
                return -1;
            }

            return head.val;
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
