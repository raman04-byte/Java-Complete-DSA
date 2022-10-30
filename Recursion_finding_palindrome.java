class Recursion {
    public static boolean palindrome(int i, int l, String s) {
        if (l >= i)
            return true;
        if (s.indexOf(i) != s.indexOf(l))
            return false;
        return palindrome(i + 1, l - 1, s);
    }

    public boolean isPalindrome(String s) {
        return palindrome(0, s.length(), s);
    }

    public static void main(String[] args) {
        String str = "Raman";
        System.out.println(palindrome(0, str.length(), str));
    }
}
