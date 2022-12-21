package LeetCode_Questions;

public class DetectCycle {
    public static void main(String[] args) {
        
    }
    public ListNode detectCycle(ListNode head){
        int length=0;
        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null &&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                length=lengthCycle(slow);
                break;
            }
        }

        if(length==0){
            return null;
        }

        ListNode f=head;
        ListNode s=head;

        while(length>0){
            s=s.next;
            length--;
        }
        while(f!=s){
            f=f.next;
            s=s.next;
        }
    }
    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                ListNode temp=slow;
                int length=0;
                do {
                    temp=temp.next;
                    length++;
                } while (temp!=slow);
                return length;
            }
        }
        return 0;
    }
}
