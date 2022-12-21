package LeetCode_Questions;
//  LeetCode 202
public class IsHappy {
    public static void main(String[] args) {
        
    }
    public boolean isHappy(int n)
    {
        int slow=n;
        int fast=n;
        do {
            slow=squareInt(slow);
            fast=squareInt(squareInt(fast));
        } while (slow!=fast);

        if(slow==1){
            return true;
        }
        return false;
    }
    private int squareInt(int n){
        int ans=0;
        while(n>0)
        {
            int rem=n%10;
            ans+=rem*rem;
            n/=10;
        }
        return ans;
    }
}
