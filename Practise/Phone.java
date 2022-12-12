package Practise;

import java.util.ArrayList;

public class Phone {
    public static void main(String[] args) {
        System.out.println(letterCombinations("", "23"));

    }

    static ArrayList<String> letterCombinations(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digits = up.charAt(0) - '1';

        ArrayList<String> list = new ArrayList<>();
        for (int i = (digits - 1) * 3; i < digits * 3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(letterCombinations(p + ch, up.substring(1)));
        }

        return list;
    }

    static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digits = up.charAt(0) - '0';
        for (int i = (digits - 1) * 3; i < digits * 3; i++) {
            char ch = (char) ('a' + i);
            pad(p + ch, up.substring(1));
        }
    }
}
