package GFGPOTD;

public class Jan_31 {
    public static void main(String[] args) {
        
    }
    class Solution {
        static int minRepeats(String A, String B) {
            // code here
            int a = A.length(),b = B.length();
            int x = (a>=b)?1:b/a;
            String temp="";
            for(int i=0;i<=2*x;i++){
                temp+=A;
                if(i<x-1) continue;
                if(temp.contains(B)) return i+1;
            }
            return -1;
        }
}}
