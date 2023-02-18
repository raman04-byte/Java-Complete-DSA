package GFGPOTD;

public class Feb_18 {
    public static void main(String[] args) {
        
    }
    public static int appleSequence(int n, int m, String arr){
        
        int ans=0;
        
        int i=0;
        int cntO=0;
        
        for(int j=0;j<n;j++)
        {
            if(arr.charAt(j)=='O') cntO++;
            
            while(i<j && cntO>m)
            {
                if(arr.charAt(i)=='O') cntO--;
                i++;
            }
            
            ans=Math.max(ans,(j-i+1));
        }
        
            return ans;
    }
}
