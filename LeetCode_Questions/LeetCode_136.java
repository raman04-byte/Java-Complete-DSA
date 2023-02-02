public class LeetCode_136 {
    public static void main(String[] args) {
        
    }
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++) ans = ans^nums[i];
        return ans; 
        }
}
