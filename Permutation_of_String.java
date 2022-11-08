import java.util.Scanner;

public class Permutation_of_String {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printPermutation(str, "");
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
