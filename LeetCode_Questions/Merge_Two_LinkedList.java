package LeetCode_Questions;

// LeetCode 21 question
public class Merge_Two_LinkedList {
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

    public static LL merge(LL first, LL second){
        Node head
        Node f=first.head;
        Node s = second.head;
        LL ans= new LL();
        while(f!=null && s!=null){
            if(f.value<s.value){
                ans.insertLast(f.value);
                f=f.next;
            }else{
                ans.insertLast(s.value);
                s=s.next;
            }
        }
        while(f!=null){
            ans.insertFirst(f.value);
            f=f.next;
        }
        while(s!=null){
            ans.insertFirst(s.value);
            s=s.next;
        }
        return ans;
    }
}
