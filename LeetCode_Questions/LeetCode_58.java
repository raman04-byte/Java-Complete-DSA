public class LeetCode_58 {
    public static void main(String[] args) {
        
    }
    public int lengthOfLastWord(String s) {
        
        int ans = 0;
        String[] arr = s.split(" ");
        
        for (int i = 0; i < arr.length; i++) {
            ans = arr[i].length();
        }
        return ans;
    }
}
