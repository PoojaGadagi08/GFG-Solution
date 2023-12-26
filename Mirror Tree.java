

class Solution {
    // Function to convert a binary tree into its mirror tree.

    void mirror(Node root) {
        // Your code here
        if(root==null){ 
            return;
        }


        //swap the nodes 
        Node temp = root.left;
        root.left =  root.right;
        root.right = temp;
        
        //iterate over all subtrees
        mirror(root.left);
        mirror(root.right);   
    }
}
