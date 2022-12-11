package Practise;

public class Permutation {
    public static void main(String[] args) {
        System.out.println(permutationsCount("", "abcd"));
    }

    static void permutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0, i);
            String l = p.substring(i,p.length());
            permutations(f+ch+l, up.substring(1));
        } 
    }
    static int permutationsCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count =0;
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0, i);
            String l = p.substring(i,p.length());
            count = count+ permutationsCount(f+ch+l, up.substring(1));
        } 
        return count;
    }
}
