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
        System.out.println();
        pattern4(n);
        System.out.println();
        pattern5(n);
        double end = System.currentTimeMillis();
        float second = (float) (end - start) / 1000F;
        System.out.println("Time taken: " + second + " seconds");
    }

    public static void pattern1(int n) {
        int rows, column;
        for (rows = 0; rows <= n; rows++) {
            for (column= 0; column<= n; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        int rows,column;
        for (rows = 0; rows <= n; rows++) {
            for ( column = 0; column <= rows; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void pattern3(int n) {
        int rows,column;
        for ( rows = n; rows >= 1; --rows) {
            for (column = 1; column <= rows; ++column) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        int row,column;
        for (row = 1; row <= n; row++) {
            for (column = 1; column <= row; column++) {
                System.out.print(column);
            }
            System.out.println();
        }
    }
    public static void pattern5(int n) {
        int rows,column;
        for (rows = 0; rows <= n; rows++) {
            for ( column = 0; column <= rows; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for ( rows = n; rows >= 1; --rows) {
            for (column = 1; column <= rows; ++column) {
                System.out.print("*");
            }
            System.out.println();
        }
    }}
