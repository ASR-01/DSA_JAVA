

public class StringSubsets {
    public static void Subsets(String str, String ans, int i) {
        if (i == str.length()) {
            System.out.print(ans + " ");
            return;
        }
        Subsets(str, ans+ str.charAt(i), i + 1);
        Subsets(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        Subsets(str, "", 0);

    }
}
