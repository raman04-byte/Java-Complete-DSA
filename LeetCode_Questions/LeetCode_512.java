class LeetCode_512 {
    public static void main(String[] args) {

    }

    public boolean detectCapitalUse(String word) {
        int countUpper = 0;
        for (char ch : word.toCharArray()) {
            if (Character.isUpperCase(ch))
                countUpper++;
        }
        if (countUpper == word.length() || countUpper == 0)
            return true;
        else if (countUpper == 1 && Character.isUpperCase(word.charAt(0)))
            return true;

        return false;
    }
}