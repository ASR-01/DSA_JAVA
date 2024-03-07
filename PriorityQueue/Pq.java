import java.util.Collections;
import java.util.PriorityQueue;

public class Pq {
    
    public static void main(String[] args) {
        // For Min
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // pq.add(10);
        // pq.add(20);
        // pq.add(30);
        // pq.add(40);
      

        // For Max
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
      
        System.err.println(pq.peek());
    }
}
