import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseK {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        int k = 4;

        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        q.add(5);
        q.add(6);
        q.add(7);

        for (int i = 1; i <= k; i++) {
            s.push(q.remove());
        }
        for (int i = 1; i <= k; i++) {
            int temp = s.pop();
            q.add(temp);
        }
        for (int i = 1; i <= q.size() - k; i++) {
            q.add(q.remove());
        }

        System.out.println(q);
    }
}
