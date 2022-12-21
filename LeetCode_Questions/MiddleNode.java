package LeetCode_Questions;
// LeetCode 876
public class MiddleNode {
    public static void main(String[] args) {
        
    }
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
