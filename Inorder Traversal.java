
// Given a Binary Tree, find the In-Order Traversal of it.
//   Expected Time Complexity: O(N).
// Expected Auxiliary Space: O(N).

/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
         ArrayList<Integer> pre = new ArrayList<>();
           preHelper(root,pre);
	  	return pre;
           
    }
public static void preHelper(Node root, ArrayList<Integer> pre) {
	if(root== null)
	return;
	
	
	preHelper(root.left,pre);
	pre.add(root.data);
	preHelper(root.right,pre);
	return;


    }
}
