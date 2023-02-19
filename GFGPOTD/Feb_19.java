package GFGPOTD;

import org.w3c.dom.Node;

public class Feb_19 {
    public static void main(String[] args) {
        
    }
    private Node first = null, second = null ,prev = null;
    private void inOrder(Node root){
        if(root == null) return;
        
        inOrder(root.left);
        if(prev != null && root.data < prev.data){
            if(first == null)
                first = prev;
            second = root;
        }
        prev = root;
        inOrder(root.right);
    }
    public Node correctBST(Node root) {
        
        inOrder(root);
        int temp = first.data;
        first.data = second.data;
        second.data = temp;
        return root;
    }
}
