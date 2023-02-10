package GFGPOTD;

public class Feb_10 {
    public static void main(String[] args) {
        
    }
    public int maxInstance(String s) {
        String ip = "balloon";
        int[] map = new int[26];
        int count=0;
        
        for(char ch : s.toCharArray()){
            map[ch-'a']++;
        }
        
        while(true){
            int i;
            for(i=0; i<ip.length(); i++){
                if(map[ip.charAt(i)-'a'] == 0){
                    break;
                }else{
                    map[ip.charAt(i)-'a']--;
                }
            }
            if(i <= ip.length()-1){
                break;
            }else{
                count++;
            }
        }
        
        return count;
    }
}
