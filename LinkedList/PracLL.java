package LinkedList;

public class PracLL {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

    }

    public static class LinkedList {
        Node Head = null;
        Node Tail = null;
        int size = 0;
        // Add Data in a Linked List

        void Add(int val) {
            Node temp = new Node(val);
            if (Head == null) {
                Head = temp;
                Tail = temp;
            } else {
                Tail.next = temp;
                Tail = temp;
            }
            size++;
        }

        void AddFirst(int val) {
            Node temp = new Node(val);
            if (Head == null) {
                Head = temp;
                Tail = temp;
            } else {
                temp.next = Head;
                Head = temp;

            }
            size++;
        }

        void AddLast(int val) {
            Node temp = new Node(val);
            if (Head == null) {
                Head = temp;
                Tail = temp;
            } else {
                Tail.next = temp;
                Tail = temp;
            }
            size++;
        }

        void AddInTheMiddle(int index, int val) {
            Node t = new Node(val);
            Node temp = Head;
            if (index == size) {
                AddLast(val);
                return;
            } else if (index == 0) {
                AddFirst(val);
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

        int removeFirst() {
            if (size == 0) {
                System.out.println("Empty LinkedList");
                return -1;
            } else if (size == 1) {
                Head = Tail = null;
                size = 0;
                return -1;
            }
            Head = Head.next;
            return -1;
        }

        int removeLast() {
            if (size == 0) {
                System.out.println("Empty LinkedList");
                return -1;
            } else if (size == 1) {
                Head = Tail = null;
                size = 0;
                return -1;
            }

            Node prev = Head;

            for (int i = 1; i < size - 1; i++) {
                prev = prev.next;
            }

            prev.next = null;
            Tail = prev;
            size--;
            return -1;

        }

        void LinearSearchLL(int key) {
            if (size == 0) {
                System.out.println("LL is Empty");
                return;
            }
            Node temp = Head;
            boolean Found = false;
            int Index = 1;
            while (temp != null) {
                if (temp.val == key) {
                    Found = true;
                    break;
                } else {
                    temp = temp.next;
                    Index++;
                }
            }
            if (Found)
                System.out.println(Index);
            else
                System.out.println("No key Present in LL");

        }

        void ReverseLL() {
            Node prev = null; // Initialize the previous node to null
            Node current = Head; // Start from the head of the linked list

            while (current != null) {
                Node next = current.next; // Store the next node temporarily
                current.next = prev; // Reverse the link to point to the previous node
                prev = current; // Move prev one step forward
                current = next; // Move current one step forward
            }

            Head = prev;

        }

        void printMiddle() {
            Node slow = Head;
            Node fast = Head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            System.out.println(slow.val);
        }

        boolean checkPalindrome() {
            if (Head == null || Head.next == null) {
                return true;
            }

            Node slow = Head;
            Node fast = Head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            Node prev = null;
            Node current = slow;
            Node next;
            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            Node right = prev;
            Node left = Head;

            while (right != null) {
                if (left.val != right.val) {
                    return false;
                }

                left = left.next;
                right = right.next;
            }
            return true;
        }

        void Display() {
            Node temp = Head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
        }

    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.Add(1);
        ll.Add(2);
        ll.Add(3);
        ll.Add(4);
        ll.Add(1);
        System.out.println(ll.checkPalindrome());
        
        // ll.Add(6);
        // ll.printMiddle();

        // ll.AddFirst(5);
        // ll.AddLast(9);
        // ll.removeLast();
        // ll.LinearSearchLL(1);
        // ll.AddInTheMiddle(2, 16);
        // // ll.removeFirst();
        // ll.removeFirst();
        // ll.ReverseLL();
        ll.Display();
        System.out.println();
        // System.out.println(ll.size);

    }
}
