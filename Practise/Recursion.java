package Practise;
// You can also correct this code by creating a Pull request and I will do much happy by accepting your Pull request
// sout = System.out.println();

import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int input = scn.nextInt();
            long start = System.currentTimeMillis();
            System.out.println(factorial(input));
            long end = System.currentTimeMillis();
            float second = (end - start) / 1000F;
            System.out.println(second);
        }

    }

    // factorial method
    static int factorial(int n) {
        if (n == 0) {
            // This sout statement will tell us that we are in IF condition
            // System.out.println("Inside IF");
            return 1;
        } else {
            // This sout statement will tell us that we are in Else condition
            // System.out.println("Inside Else");
            return (n * factorial(n - 1));
        }
    }
}

// Time Complexity of this method with Recursion
// O(n) ("This method is calling himself n times so the time Complexity will be
// this ")
// Space Complexity of this method with Recursion
// O(n) ("This method is calling himself n times so the space Complexity will be
// this ")