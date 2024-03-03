package Strings;

import java.util.HashMap;

public class panagram {

    public static boolean checkIfPangram(String sh) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = sh.length();

        for (int i = 0; i < n; i++) {
            char ch = sh.charAt(i);
            map.put(ch, 1);
        }

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            if (!(map.containsKey(ch)))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String sh = "abcdefghijklmnopqrstuvwxyz";

        boolean ans = checkIfPangram(sh);

        System.out.println(ans);
    }
}