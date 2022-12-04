package Practise;

public class Unique {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 3, 3, 4, 5, 6, 6, 5 };
        System.out.println(ans(arr));

    }

    private static int ans(int[] arr) {
        int unique = 0;
        for (int n : arr) {
            unique ^= n;
        }
        return unique;
    }
}
