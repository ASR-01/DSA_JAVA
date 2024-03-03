package LinkedList;

public class Implementation {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;
        int size = 0;

        void AddAtEnd(int val) {
            Node newNode = new Node(val);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }

            // tail = newNode;
            size++;

        }

        void AddAtBegin(int val) {
            Node newNode = new Node(val);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                // Node currentNode = head;
                // head = newNode;
                // head.next = currentNode;
                newNode.next = head;
                head = newNode;

            }
            size++;
        }

        void InsertIndex(int index, int val) {
            Node t = new Node(val);
            Node temp = head;
            if (index == size) {
                AddAtEnd(val);
                return;
            } else if (index == 0) {
                AddAtBegin(val);
                return;
            } else if (index < 0) {
                System.out.println("Input Cannot be Negative");
                return;
            } else if (index > size) {
                System.out.println("Index cannot be greater than size");
                return;

            }
            for (int i = 1; i < index - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;

            size++;

        }

        void DeleteAtIndex(int index) {
            if (index < 0) {
                System.out.println("Input Cannot be Negative");
                return;
            } else if (index >= size) {
                System.out.println("Index cannot be greater than size");
                return;
            } else if (index == 0) {
                head = head.next;
                size--;
                return;
            }
            Node temp = head;
            for (int i = 1; i <= index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (index == size - 1) {
                tail = temp; // Update tail when deleting the last element
            }
            size--;
        }

        void getElement(int index) {
            Node temp = head;
            if (index < 0) {
                System.out.println("Input Cannot be Negative");
                return;
            } else if (index >= size) {
                System.out.println("Index cannot be greater than size");
                return;
            }
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            int ans = temp.val;
            System.out.println(ans);

        }

        void Display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
        }

        // int size() {
        // Node temp = head;
        // int count = 0;
        // while (temp != null) {
        // count++;
        // temp = temp.next;
        // }

        // return count;
        // }

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.AddAtEnd(1);
        // ll.AddAtEnd(2);
        // ll.AddAtEnd(3);
        // ll.AddAtEnd(4);
        // ll.AddAtEnd(7);
        ll.DeleteAtIndex(0);
        // ll.AddAtBegin(9);
        // ll.AddAtBegin(6);
        // ll.getElement(7);
        // System.out.println(ll.size);
        // ll.AddAtBegin(8);
        // ll.InsertIndex(5, 6);
        // ll.InsertIndex(1, 5);
        // ll.InsertIndex(3, 5);
        // System.out.println(ll.head.val);

        ll.Display();
        // System.out.println(ll.size);
        System.out.println(ll.tail.val);

    }
}
