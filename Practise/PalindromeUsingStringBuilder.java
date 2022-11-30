package Practise;

import java.util.Scanner;

public class PalindromeUsingStringBuilder {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string");

    String st1 = scn.nextLine();

    StringBuilder stringBuilder = new StringBuilder(st1);
    String str2 = String.valueOf(stringBuilder.reverse());
        if(st1.equals(str2)){
            System.out.println("Palinrome");
        }else{
            System.out.println("Not Palindrome");
        }
}
    
}
