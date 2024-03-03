package Strings;

public class funcString {
    public static void main(String[] args) {
        // compare
        // String st1 ="Adi";
        // String st2 = "adi";

        // if (st1.compareTo(st2) == 0) {
        // System.out.println("True");
        // }
        // else{
        // System.out.println("False");

        // }

        // // Substring
        // String st= "hamburger";
        // // System.out.println(st.substring(4,8));
        // System.out.println(st.substring(4,st.length()-1));

        // String builder
        // StringBuilder sb = new StringBuilder("Adi");
        // System.out.println(sb);
        // System.out.println(sb.charAt(0));
        // sb.setCharAt(0,'T');
        // sb.insert(2, 'A');
        // sb.delete(0 , 1);
        // sb.append("Rawat");
        // System.out.println(sb);
        // System.out.println(sb.length());
        // sb.reverse();
        // System.out.println(sb);

        // Reverse a String

        // // StringBuilder sb = new StringBuilder("Aditya");
        // String st = "Aditya";
        // char ch[] = st.toCharArray();
        // int s = 0;
        // int e = ch.length - 1;

        // while (s < e) {
        //     char temp = ch[s];
        //     ch[s] = ch[e];
        //     ch[e] = temp;
        //     s++;
        //     e--;
        // }
       
        // String ans = new String(ch);
        // System.out.println(ans);
        

        StringBuilder sb = new StringBuilder("Ram");
        for (int i = 0; i < sb.length()/2; i++) {
             int s = i;
             int e = sb.length()-1-i;

             char front = sb.charAt(s);
             char back = sb.charAt(e);

             sb.setCharAt(s, back);
             sb.setCharAt(e, front);
        }

        System.out.println(sb);

    }
}
