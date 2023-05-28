Given a Binary Search Tree. The task is to find the minimum valued element in this given BST.

Example 1:

Input:
           5
         /    \
        4      6
       /        \
      3          7
     /
    1
Output: 1
  
  
  /*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Tree {
    // Function to find the minimum element in the given BST.
    int minValue(Node root) {
         if (root == null) {
            return -1;
        }
        while (root.left != null) {    // Traverse to the leftmost node
            if (root.left.data < root.data) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return root.data;
    }
}
