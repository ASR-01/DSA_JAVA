

public class QuestionsDaySecond {
    public static int Power(int a, int n) {
        if (n == 0) {
            return 1;
        }

        // return a * Power(a, n - 1);

        int temp = Power(a, n / 2);
        if (n % 2 == 0)
            return temp * temp;
        else
            return temp * temp * a;

    }

    
    public static void main(String[] args) {
             


    }
}
