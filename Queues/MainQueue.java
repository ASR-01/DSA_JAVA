import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // Operations
        q.add(3);
        q.add(4);
        q.add(1);
        q.add(2);
        q.remove();
        q.size();
        System.out.println(q.size());

    }
}
