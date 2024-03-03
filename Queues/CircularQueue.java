

public class CircularQueue {
    public static class Queue {
        int arr[];
        int size;
        int rear;
        int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        boolean isFull() {
            return (rear + 1) % size == front;
        }

        void add(int data) {
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }

            if (front == -1) {
                front = -1;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int result = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front - 1) % size;
            }
            return result;
        }

        int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return arr[front];
        }

    }

    public static void main(String[] args) {

    }
}
