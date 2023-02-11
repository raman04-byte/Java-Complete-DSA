package GFGPOTD;

import java.util.HashMap;
import java.util.Map;

public class Feb_11 {
    public static void main(String[] args) {
        
    }
    public static int getMinimumDays(int n, String s, int[] p) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++) map.put(p[i], i+1);
        
        int i = 0, j =0;
        int days = 0;
        
        for(; j<n; j++) {
            if(s.charAt(i) != s.charAt(j)) {
                days = Math.max(days, code(s, i, j-1, map));
                i = j;
                j--;
            }}
        
        if(i != j-1) days = Math.max(days, code(s, i, j-1, map));
        return days;
    }
    
    private static int code(String s, int start, int end, Map<Integer, Integer> map)
    {
        int left = 0;
        for(int k=start; k<=end; k+=2) left = Math.max(left, map.get(k));
        
        int right = 0;
        for(int k=start+1; k<=end; k+=2) right = Math.max(right, map.get(k));
        
        return Math.min(left, right);
    }
}
