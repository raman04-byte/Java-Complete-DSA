package GFGPOTD;

import java.util.Stack;

public class Jan_23 {
    public static String removePair(String str) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (st.isEmpty()) {
                st.push(str.charAt(i));
            }
            else if (str.charAt(i) == st.peek()) {
                st.pop();
            } else {
                st.push(str.charAt(i));
            }
        }
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.length() == 0 ? "-1" : sb.reverse().toString();
    }

    public static void main(String[] args) {

    }
}