package Pattern_Questions;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        double start = System.currentTimeMillis();
        pattern1(n);
        System.out.println();
        pattern2(n);
        System.out.println();
        pattern3(n);
        double end = System.currentTimeMillis();
        float second = (float) (end - start) / 1000F;
        System.out.println("Time taken: " + second + " seconds");
    }

    public static void pattern1(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int row = 0; row <= n; row++) {
            for (int column = 0; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    
    public static void pattern3(int n) {
        for (int rows = n; rows >= 1; --rows) {
            for (int j = 1; j <= rows; ++j) {
              System.out.print("*");
            }
            System.out.println();
          }
}}