package LeetCode_Questions;
// LeetCode question 83
public class LinkedList {
    public static void main(String[] args) {
        
    }
    public ListNode deleteDuplicates(ListNode node) {
        if(node==null){
            return node;
        }
        ListNode head=node;
        while(node.next!=null){
            if(node.val==node.next.val){
                node.next=node.next.next;
                
            }else{
                node=node.next;
            }
        }
        return head; 
    }
}

