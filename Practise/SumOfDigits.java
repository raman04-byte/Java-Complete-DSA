package Practise;

public class SumOfDigits {
    public static void main(String[] args) {
        // int ans = sum(1234);
        // System.out.println(ans);
        System.out.println(rev2(1234));
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return(n%10)+sum(n/10);
    }
    static int sum;
    static void rev1(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        rev1(n/10);
    }

    static int rev2(int n){
        int digits=(int)(Math.log10(n))+1;
        return helper(n, digits);
    }
    private static int helper(int n, int digits) {
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*(int)(Math.pow(10, digits-1))+helper(n/10, digits-1);
    }   
}
