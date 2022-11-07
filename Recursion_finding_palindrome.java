import java.util.Scanner;

class Recursion {
    static boolean isPalRec(String str, int s, int e) {
// If the starting and ending pointer come to single location then the character at that 
// index is always the same
// that is the reason why we are returning the true here
        if (s == e)
            return true;
            // If the character at the index is not same then we are returning false
        if ((str.charAt(s)) != (str.charAt(e)))
            return false;
            // We will traverse the string 
        if (s < e + 1)
            return isPalRec(str, s + 1, e - 1);

        return true;
    }
// Method is checking the string is Palindrome or not
    static boolean isPalindrome(String str) {
        int n = str.length();
        if (n == 0)
            return true;

        return isPalRec(str, 0, n - 1);
    }
// Main method 
    public static void main(String args[]) {
        String str;
        Scanner scn = new Scanner(System.in);

        str = scn.nextLine();

        if (isPalindrome(str))
            System.out.println("The string is Palindrome");
        else
            System.out.println("The string is not Palindrome");
    }
}