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
        System.out.println();
        pattern6(n);
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
    }
    public static void pattern6(int n){
        int rows,column,spaces,total_number_of_spaces;
        for(rows=0;rows<2*n;rows++){
            int total_Columns_in_row=rows>n?2*n-rows:rows;
            total_number_of_spaces = n-total_Columns_in_row;
            for(spaces=0;spaces<total_number_of_spaces;spaces++){
                System.out.print(" ");
            }
            for(column=0;column<total_Columns_in_row;column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
