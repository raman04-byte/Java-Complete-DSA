package Practise;

public class Sqrt_UsingBinarySearch {
    public static void main(String[] args) {
        int n=8;
        int p=2;
        System.out.println(sqrt(n, p));
    }
    public static double sqrt(int n, int p){
        int s=0;
        int e=n;
        double root = 0.0;
        while(s<=e){
            int m=s+(e-s)/2;
            int sqr=m*m;
            if(sqr==n){
                return m;
            }
            if(sqr>n){
                e=m-1;
            }else{
                s=m+1;
            }

        }
        double inc = 0.1;
        for(int i=0;i<p;i++){
            while(root*root<=n){
                root+=inc;
            }
            root-=inc;
            inc/=10;
        }
        return root;
    }
}
