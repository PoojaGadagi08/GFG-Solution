Given a Binary Search Tree and a node value X. Delete the node with the given value X from the BST. If no node with value x exists, then do not make any change. 

Example 1:

Input:
      2
    /   \
   1     3
X = 12
Output: 1 2 3
Explanation: In the given input there
is no node with value 12 , so the tree
will remain same.
Example 2:

Input:
            1
             \
              2
                \
                 8 
               /    \
              5      11
            /  \    /  \
           4    7  9   12
X = 9
Output: 1 2 4 5 7 8 11 12
Explanation: In the given input tree after
deleting 9 will be
             1
              \
               2
                 \
                  8
                 /   \
                5     11
               /  \     \
              4    7     12
Your Task:
You don't need to read input or print anything. Your task is to complete the function deleteNode() which takes two arguments. The first being the root of the tree, and an integer 'X' denoting the node value to be deleted from the BST. Return the root of the BST after deleting the node with value X. Do not make any update if there's no node with value X present in the BST.

Note: The generated output will be the inorder traversal of the modified tree.
 

Expected Time Complexity: O(Height of the BST).
Expected Auxiliary Space: O(Height of the BST).
 

Constraints:
1 <= N <= 105




  class Tree {
    
    static Node maxVal(Node root) {
        if (root == null) return null;
        
        Node temp = root;
        
        while (temp.right != null) {
            temp = temp.right;
        }
        return temp;
    }

    static Node Delete(Node root, int key) {
        if (root == null) return root;
        
        if (root.data == key) {
            // 0 child 
            if (root.left == null && root.right == null) {
                return null;
            }
            
            // 1 child
            // Left Child
            else if (root.left != null && root.right == null) {
                Node temp = root.left;
                return temp;
            } 
            // Right Child
            else if (root.right != null && root.left == null) {
                Node temp = root.right;
                return temp;
            } 
            
            // 2 child
            else {
                int maxi = maxVal(root.left).data;
                root.data = maxi;
                root.left = Delete(root.left, maxi);
                return root;
            }
        } 
        else if (key < root.data) {
            root.left = Delete(root.left, key);
            return root;
        } 
        else {
            root.right = Delete(root.right, key);
            return root;
        }
    }

    // Function to delete a node from BST.
    public static Node deleteNode(Node root, int key) {
        Node ans = Delete(root, key);
        return ans;
    }
}

