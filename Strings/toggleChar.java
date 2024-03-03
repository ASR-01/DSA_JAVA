package Strings;

import java.util.Scanner;

public class toggleChar {

    public static void Toggle(char ch[]) {
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 65 && ch[i] <= 90) {
                ch[i] = (char) (ch[i] + 32);
            } else {
                ch[i] = (char) (ch[i] - 32);
            }
        }

      
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        char ch[] = new char[n];
        String st = scn.nextLine();

        for (int i = 0; i < ch.length; i++) {
            ch[i] = st.charAt(i);
        }

        Toggle(ch);

        System.out.println(ch);
    }

}
