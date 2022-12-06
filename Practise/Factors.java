package Practise;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        // factor1(60);
        // factors2(60);
        factors3(60);
    }
    public static void factor1(int n) 
    {
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i+" ");
            }
        }    
    }
    public static void factors2(int n){
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                    if(n/i==i){
                        System.out.print(i+" ");
                    }else{
                        System.out.print(i+" "+n/i+" ");
                    }
            }
        }    
        
    }
    public static void factors3(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                    if(n/i==i){
                        System.out.print(i+" ");
                    }else{
                        System.out.print(i+" ");
                        list.add(n/i);
                    }
            }
        }    
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        
    }
}
