package LinkedList;

public class SinglyLinkedList {
    public static void InsertAtEnd(Node head, int val) {
        Node n6 = new Node(val);

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = n6;
    }

    public static void Display(Node head) {

        Node temp = head;

        while (temp != null) {
        System.out.print(temp.val + " --> ");
        temp = temp.next;
        }

    }

    public static void Recursive(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.val + " ");
        Recursive(head.next);
    }

    public static int Length(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }

        return count;
    }

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        // Node temp = n1;
        // System.out.println(temp.val);
        // for (int i = 1; i <= 5; i++) {
        // System.out.print(temp.val + " --> ");
        // temp = temp.next;
        // }

        // while (temp != null) {
        // System.out.print(temp.val + " --> ");
        // temp = temp.next;
        // }

        // Using Functions
        // Recursive(n1);
        // int length = Length(n1);
        // System.out.println(length);
        // InsertAtEnd(n1, 67);
        System.out.println(n1.next.val);

        
        // Display(n1);
    }

}
