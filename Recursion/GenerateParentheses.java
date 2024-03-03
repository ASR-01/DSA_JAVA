

import java.util.ArrayList;

public class GenerateParentheses {
    public static void GP(int n, ArrayList<String> res, String temp, int left, int right) {
      if (left+right == 2*n) {
        res.add(temp);
        return;
      }

        if (left < n) {
            GP(n, res, temp + "(", left + 1, right);
        }
        if (right < left) {
            GP(n, res, temp + ")", left, right + 1);

        }
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<String> res = new ArrayList<>();
        GP(n, res, "", 0, 0);
        System.out.println(res);
    }
}
