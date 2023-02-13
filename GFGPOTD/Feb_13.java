package GFGPOTD;

public class Feb_13 {
    public static void main(String[] args) {
        
    }
    static int inSequence(int A, int B, int C) {
        if(C==0) return A==B ? 1 : 0;
        else return (B-A)%C == 0 && (B-A)/C >= 0 ? 1 : 0;
    }
}
