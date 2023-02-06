package GFGPOTD;

import org.w3c.dom.Node;

public class Feb_6 {
    public static void main(String[] args) {
        
    }
    Node findTarget(Node root, int target) {
        if(root == null) return null;
        if(root.data == target) return root;
        if(root.data > target) return findTarget(root.left, target);
        return findTarget(root.right, target);
    }
    long traverseVertically(Node root, int position) {
        if(root == null) return 0;
        long left = traverseVertically(root.left, position+1);
        long right = traverseVertically(root.right, position-1);
        return (position == 0 ? root.data : 0) + left + right;
    }
    long verticallyDownBST(Node root,int target) {
        Node result = findTarget(root, target);
        if(result == null) return -1;
        return traverseVertically(result, 0) - result.data;
    }
}

