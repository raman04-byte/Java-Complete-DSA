// LeetCode question 1833
import java.util.Arrays;

public class LeetCode_1833 {
    public static void main(String[] args) {
        
    }
    public int maxIceCream(int[] costs, int coins) {
        // Store ice cream costs in increasing order.
        Arrays.sort(costs);
        int n = costs.length;
        int answer = 0;
        // Pick ice creams till we can.
        while (answer < n && costs[answer] <= coins) {
            // We can buy this icecream, reduce the cost from the coins. 
            coins -= costs[answer];
            answer += 1;
        }
        return answer;
    }
}