Given a binary tree. Find the preorder traversal of the tree without using recursion.


Example 1:

Input:
           1
         /   \
        2     3
      /  \
     4    5
Output: 1 2 4 5 3
Explanation:
Preorder traversal (Root->Left->Right) of 
the tree is 1 2 4 5 3.
Example 2

Input:
            8
          /   \
         1      5
          \    /  \
           7  10   6
            \  /
            10 6
Output: 8 1 7 10 5 10 6 6 
Explanation:
Preorder traversal (Root->Left->Right) 
of the tree is 8 1 7 10 5 10 6 6.
 

Your task:

You don't need to read input or print anything. Your task is to complete the function preOrder() which takes the root of the tree as input and returns a list containing the preorder traversal of the tree, calculated without using recursion.


Expected time complexity: O(N)
Expected auxiliary space: O(N)



  class Tree
{
    // Return a list containing the Preorder traversal of the given tree
    ArrayList<Integer> preOrder(Node root)
    {
        // Code
        Stack<Node> s =new Stack<>();
        ArrayList<Integer> ans =new ArrayList<>();
        
        s.push(root);
        while(!s.isEmpty()){
            Node temp = s.pop();
            
          
            
            if(temp.right != null)
            s.push(temp.right);
            
              if(temp.left != null)
            s.push(temp.left);
            
            ans.add(temp.data);
            
        }
        return ans;
    }
    
    
}
