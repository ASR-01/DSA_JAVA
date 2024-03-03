package Stacks;

import java.util.*;

public class ReverseArray {

    public static void main(String[] args) {
        Stack<Character> ch = new Stack<>();

        ch.push('a');
        ch.push('d');
        ch.push('i');
        ch.push('t');
        ch.push('y');
        ch.push('a');
        System.out.println(ch);

        while (!ch.isEmpty()) {
            System.out.print(ch.pop() + " ");
        }

    }
}
