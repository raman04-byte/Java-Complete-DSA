package Practise;

import java.util.Arrays;

public class ReverseOfArray {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        System.out.println("Original array is " + Arrays.toString(a));
        reverse(a,a.length);
    }
    static void reverse(int[] a, int n){
        int[] b = new int[n];
        int j=n;
        for(int i=0;i<a.length;i++){
            b[j-1] = a[i];
            j--;
        }
        System.out.println("Reversed array is " + Arrays.toString(b));
    }
}
