
public class StringRecursion {
    public static boolean Palindrome(String ss) {
        int len = ss.length();
        if (len <= 1) {
            return true;
        } else {
            if (ss.charAt(0) != ss.charAt(len - 1)) {
                return false;
            } else {
                // System.out.println("Checking if " + ss.substring(1, len - 1) + " is a
                // palindrome");
                return Palindrome(ss.substring(1, len - 1));
            }
        }
    }

    public static int CountVowels(String ss, int index) {
        if (index == -1) {
            return 0;
        }

        if (ss.charAt(index) == 'a' || ss.charAt(index) == 'e' || ss.charAt(index) == 'i' || ss.charAt(index) == 'o'
                || ss.charAt(index) == 'u') {
            return 1 + CountVowels(ss, index - 1);
        } else {
            return CountVowels(ss, index - 1);

        }
    }

    public static String StringReverse(String ss, int s, int e) {
        if (s>=e) {
            return ss;
        }
           char Arr[] = ss.toCharArray();
           char temp = Arr[s];
            Arr[s] = Arr[e];
            Arr[e] = temp;

           
            return StringReverse(new String(Arr), s + 1, e - 1);

    }

    public static void main(String[] args) {

        String ss = "aditya";
        int index = ss.length() - 1;
        String rev = StringReverse(ss,0,index);
        System.out.println(rev);

        // int ans = CountVowels(ss, index);
        // System.out.println(ans);
        // int s = 0;
        // int e = palindrome.length() - 1;

        // if (Palindrome(ss)) {
        // System.out.println("String is a Palindrome");
        // } else
        // System.out.println("String is not a Palindrome");

        // boolean ss = true;

        // while (s <= e) {
        // if (palindrome.charAt(s) != palindrome.charAt(e)) {
        // ss = false;
        // break;
        // } else {
        // s++;
        // e--;
        // }
        // }
        // if (ss==true) {
        // System.out.println("String is a Palindrome");
        // } else {
        // System.out.println("String is not a Palindrome");

        // }
        // String ss = "Aditya";
        // char Arr[] = ss.toCharArray();

        // int s = 0;
        // int e = ss.length() - 1;
        // while (s <= e) {
        //     char temp = Arr[s];
        //     Arr[s] = Arr[e];
        //     Arr[e] = temp;

        //     s++;
        //     e--;
        // }

        // String newStr = new String(Arr);
        // System.out.println(newStr);

    }
}
