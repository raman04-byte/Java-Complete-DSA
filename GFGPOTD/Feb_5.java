package GFGPOTD;
// GeeksforGeeks Problem Date: Frb 5
import org.w3c.dom.Node;

public class Feb_5 {
    public static void main(String[] args) {

    }

    int intersectPoint(Node head1, Node head2) {
        // code here
        int n = 0;
        int m = 0;
        Node h1 = head1;
        Node h2 = head2;
        while (h1 != null) {
            n++;
            h1 = h1.next;
        }
        while (h2 != null) {
            m++;
            h2 = h2.next;
        }
        if (n > m) {
            while (n != m) {
                n--;
                head1 = head1.next;
            }
        } else {
            while (n != m) {
                m--;
                head2 = head2.next;
            }
        }
        while (head1 != head2) {
            head1 = head1.next;
            head2 = head2.next;
        }
        return head1.data;
    }
}
