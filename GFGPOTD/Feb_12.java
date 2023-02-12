package GFGPOTD;

public class Feb_12 {
    public static void main(String[] args) {

    }

    class Solution {
        Node primeList(Node head) {

            // code here

            Node list = head;

            do {

                int N = list.val;

                if (isPrime(N) == 1)

                {

                    list.val = N;

                }

                else

                {

                    int num1 = N - 1;

                    int num2 = N + 1;

                    while (num1 >= 0)

                    {

                        if (isPrime(num1) == 1)

                        {

                            list.val = num1;

                            break;

                        }

                        else if (isPrime(num2) == 1) {

                            list.val = num2;

                            break;

                        }

                        num1--;

                        num2++;

                    }

                }

                list = list.next;

            } while (list != null);

            return head;

        }

        static int isPrime(int N) {

            if (N == 1 || N == 0)

                return 0;

            for (int i = 2; i <= Math.sqrt((double) N); i++)

            {

                if (N % i == 0)

                {

                    return 0;

                }

            }

            return 1;

        }

    }
}
