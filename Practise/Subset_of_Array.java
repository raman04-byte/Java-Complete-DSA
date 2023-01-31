package Practise;
import java.util.Scanner;

class Ree {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            long start = System.currentTimeMillis();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scn.nextInt();
            }
            int limit = (int) Math.pow(2, arr.length);
            for (int i = 0; i < limit; i++) {
                String set = "";
                int temp = i;
                for (int j = arr.length - 1; j >= 0; j--) {
                    int r = temp % 2;
                    temp = temp / 2;
                    if (r == 0) {
                        set = "-\t" + set;

                    } else {
                        set = arr[j] + "\t" + set;
                    }
                }
                System.out.println(set);
            }
            long end = System.currentTimeMillis();
            float second = (end - start) / 1000F;
            System.out.println("time:" + second);
        }
    }
}