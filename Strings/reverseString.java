package Strings;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String st = scn.nextLine();
        char ch[] = st.toCharArray();
        int n = st.length();

        int s = 0;
        int e = n - 1;

        while (s <= e) {

            char temp = ch[s];
            ch[s] = ch[e];
            ch[e] = temp;
            s++;
            e--;

        }
        String ans = st.valueOf(ch);
        System.out.println(ans);
                

    }
}
