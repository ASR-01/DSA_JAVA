

public class Question {
    public static int printSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + printSum(n - 1);
    }

    public static int printFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * printFactorial(n - 1);
    }

    public static int fib(int n) {
        if (n < 2) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void print1toN(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }

        print1toN(n - 1);
        System.out.print(n + " ");

    }

    public static void main(String[] args) {
        int n = 5;
        // int s = fib(n);
        // System.out.println(s);
        print1toN(n);
    }
}
