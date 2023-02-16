package GFGPOTD;

public class Feb_16 {
    public static void main(String[] args) {
        
    }
    public static int goodStones(int n, int[] arr) {
        int[] phase = new int[n];
        int cnt = 0;
        
        for(int i=0; i<n; i++) {
            if(phase[i] == 0) code(i, n, arr, phase);
            if(phase[i] == 2) ++cnt;
        }
        return cnt;
    }
    
    private static boolean code(int i, int n, int[] arr, int[] phase) {
        if(i < 0 || i >= n || phase[i] == 2) return true;
        if(phase[i] == 1) return false;
        
        phase[i] = 1;
        boolean cc = code(i+arr[i], n, arr, phase);
        
        if(cc) phase[i] = 2;
        return cc;
    }
}
