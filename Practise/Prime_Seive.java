package Practise;

public class Prime_Seive {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];
        seives(n, primes);
    }

    public static void seives(int n, boolean[] prime) {
        for (int i = 2; i * i <= n; i++) {
            if (!prime[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    // Printing the all j value where this loop is iterating 
                    // System.out.println(j);
                    prime[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!prime[i]) {
                // Printing the array of boolean
                System.out.print(i + " ");
            }
        }
    }

}
