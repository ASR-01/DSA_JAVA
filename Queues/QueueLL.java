

public class QueueLL {

    public static class Node {

        int val;
        Node next = null;

        Node(int val) {
            this.val = val;
            this.next = null;
        }

    }

    public static class Queue {

        Node head = null;
        Node tail = null;

        boolean isEmpty() {
            return head == null && tail == null;
        }

        void Add(int val) {
            Node newNode = new Node(val);

            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int front = head.val;
            if (tail == head) {
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;
        }
        int peek(){
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return head.val;
        }
    }

    public static void main(String[] args) {

    }
}
