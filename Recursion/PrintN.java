
import java.util.Scanner;

public class PrintN {

    public static void printNto1(int n) {

        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        printNto1(n - 1);

    }

    public static void print1toN(int n) {

        if (n == 1) {
            System.out.print(n + " ");
            return;
        }

        print1toN(n - 1);
        System.out.print(n + " ");

    }

    public static int factorialOfN(int n) {

        if (n == 1) {
            return 1;
        }

        return n * factorialOfN(n - 1);

    }

    public static int SumOfN(int n) {

        if (n == 1) {
            return 1;
        }

        return n + SumOfN(n - 1);

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // System.out.println("Factorial of " + n + ": " + factorialOfN(n));
        // System.out.println("Sm of " + n + ": " + SumOfN(n));
        print1toN(n);

    }
}
