// LeetCode question 1
public class LeetCode_1 {
    public static void main(String[] args) {
        
    }
    public int[] twoSum(int[] nums, int target) {
        int i;
        int j;
        int size = nums.length;
        int[] result = new int[2];
        
        for( i = 0; i < size; i++ )
        {
            for ( j = i+1; j < size; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
                
            }
            
        }
        return result;
    }
}
