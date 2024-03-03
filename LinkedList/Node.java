package LinkedList;

public class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        n1.next = n2;
        // System.out.println(n1.next.val); --> 20
        Node n3 = new Node(30);
        n1.next.next = n3;
        // System.out.println(n1.next.next.val); --> 30
        // System.out.println(n2.next.val); --> 30
        // System.out.println(n1.next.next.next); ---> Null
        // System.out.println(n1.next); --> Address Of N2
    }
}
