package Practise;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 5;
        
        // System.out.println("Ans = "+fibo(a));
        for (int i = 0; i < 11; i++) {
        System.out.println(fiboFormula(i));    
        }
    }

    static int fiboFormula(int n){
        return (int)(Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
    }

    static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        System.out.println(fibo(n - 1));
        System.out.println(fibo(n - 2));
        return fibo(n - 1) + fibo(n - 2);
    }
}
