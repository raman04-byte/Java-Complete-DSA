package GFGPOTD;

public class Jan29 {
    
        public static int solve(int a, int b) {
            if(a==b)return 0;
    
            if((a & b) == a || (a & b) == b)return 1;
    
            return 2;
        }
    public static void main(String[] args) {
        
    }
}
