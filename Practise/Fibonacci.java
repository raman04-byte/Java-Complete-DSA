package Practise;

public class Fibonacci {
    public static void main(String[] args) {
        int a =5;
        System.out.println("Ans = "+fibo(a));
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        System.out.println(fibo(n-1));
        System.out.println(fibo(n-2));
        return fibo(n-1)+fibo(n-2);
    }
}
