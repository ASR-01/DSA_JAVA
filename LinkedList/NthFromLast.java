package LinkedList;

public class NthFromLast {
    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node NthFromLastInLinkList(Node head, int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        int a = size - n + 1;
        temp = head;

        for (int i = 1; i < a; i++) {
            temp = temp.next;
        }

        return temp;

    }

    public static Node NthFromLastInLinkList2(Node head, int n) {
        Node fast = head;
        Node slow = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {

            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }

    public static Node RemoveNthFromLastInLinkList(Node head, int n) {
        Node fast = head;
        Node slow = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            head = head.next;
            return head;
        }
        while (fast.next != null) {

            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return head;
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

        // Node temp = NthFromLastInLinkList(n1, 2);
        // Node temp = NthFromLastInLinkList2(n1, 2);
        Node temp = RemoveNthFromLastInLinkList(n1, 5);
        printLinkedList(temp);

    }
}
