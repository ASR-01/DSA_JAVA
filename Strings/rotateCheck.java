package Strings;

public class rotateCheck {

    public static String rotateClock(String str2) {
        char ch1[] = str2.toCharArray();
        char temp = ch1[ch1.length - 1];
        for (int i = ch1.length - 2; i >= 0; i--) {
            ch1[i + 1] = ch1[i];
        }
        ch1[0] = temp;
        return String.valueOf(ch1);

    }

    public static String rotateAntiClock(String str2) {
        char ch1[] = str2.toCharArray();
        char temp = ch1[0];
        for (int i = 1; i < ch1.length; i++) {
            ch1[i - 1] = ch1[i];
        }
        ch1[ch1.length - 1] = temp;
        return String.valueOf(ch1);

    }

    public static void main(String[] args) {
        String str1 = "amazon";
        String str2 = "azonam";

        String cr1 = rotateClock(str2);
        String cr2 = rotateClock(cr1);

        String ar1 = rotateAntiClock(str2);
        String ar2 = rotateAntiClock(ar1);

        if (cr2.equals(str1)) {
            System.out.print("hello");
        } else {
            System.out.print("byby");
        }
        // return cr2.equals(str1) || ar2.equals(str1);

    }
}
