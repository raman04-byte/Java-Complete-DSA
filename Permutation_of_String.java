import java.util.Scanner;

public class Permutation_of_String {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long start = System.currentTimeMillis();
        String str = scn.next();
        printPermutation(str, "");
        long end = System.currentTimeMillis();
        float second=(end-start)/1000F;
        System.out.println(second + " Seconds");
    }
    public static void printPermutation(String queString, String asf){
        if(queString.length() ==0){
            System.out.println(asf);
            return;
        }
        for(int i=0;i<queString.length();i++){
            char ch = queString.charAt(i);
            String leftPart = queString.substring(0, i);
            String rightPart = queString.substring(i+1);
            String remaining = leftPart + rightPart;
            printPermutation(remaining, asf+ch);
        }
    }

}