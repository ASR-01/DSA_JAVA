package Strings;

import java.util.Scanner;

public class strings {

    public static void main(String[] args) {

        // String s = "A d i t y a";
        // String st[] = s.split(" ");

        // char ch ='a';
        // String s = "";

        // s+= ch;

        // System.out.println(s);

        // Scanner scn = new Scanner(System.in);
        // // String st = scn.nextLine();
        // // System.out.println(st + " Singh Rawat");
        // char ch = scn.nextLine().charAt(0);
        // System.out.println(ch);

        // String st = "Aditya";
        // System.out.println(st.charAt(0));
        // int ch = 'A';
        // // ch = ch + 2;
        // char ch = 'A';
        // ch = (char)(ch + 3);
        // System.out.println(ch);

        // String st = "Hello";
        // // st = st + " Aditya";
        // // st.replace("e", "i");
        // // System.out.print(st.replace("e", "i"));
        // // System.out.print(st.split('e',2));
        // System.out.println(st.length());

        String s = "bac";
        // String str = s.substring(0,1) + s.substring(1+1);
        // System.out.println(str);

    

        for (int i = 0; i < s.length(); i++) {
      
            String str = s.substring(0,i) + s.substring(i+1);

           System.out.println(str);
        }
        System.out.println(s);

        // boolean isPresent[] = new boolean[26];

        // for (int i = 0; i < s.length(); i++) {
        // char ch = s.charAt(i);
        // if ('a' <= ch && ch <= 'z') {
        // int pos = ch - 'a';
        // isPresent[pos] = true;
        // System.out.println(isPresent[pos]);
        // }

        // }

    }
}
