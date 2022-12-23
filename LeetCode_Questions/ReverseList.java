package LeetCode_Questions;
//  LeetCode 206 problem solution
public class ReverseList {
    public static void main(String[] args) {

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head){
        if(head==null){
            return head;
        }
        ListNode present=head.next;
        head.next=null;
        while(present!=null){
            ListNode t=present.next;
            present.next=head;
            head=present;
            present=t;

        }
        return head;
    }

}
