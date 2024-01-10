Given a binary tree. Find the size of its largest subtree that is a Binary Search Tree.
Note: Here Size is equal to the number of nodes in the subtree.

Example 1:

Input:
        1
      /   \
     4     4
   /   \
  6     8
Output: 1
Explanation: There's no sub-tree with size
greater than 1 which forms a BST. All the
leaf Nodes are the BSTs with size equal
to 1.
Example 2:

Input: 6 6 3 N 2 9 3 N 8 8 2
            6
        /       \
       6         3
        \      /   \
         2    9     3
          \  /  \
          8 8    2 
Output: 2
Explanation: The following sub-tree is a
BST of size 2: 
       2
    /    \ 
   N      8
Your Task:
You don't need to read input or print anything. Your task is to complete the function largestBst() that takes the root node of the Binary Tree as its input and returns the size of the largest subtree which is also the BST. If the complete Binary Tree is a BST, return the size of the complete Binary Tree. 

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Height of the BST).

Constraints:
1 ≤ Number of nodes ≤ 105
1 ≤ Data of a node ≤ 106





  class Solution{
    
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root)
    {
       trav(root);
       int k=max;
       max=0;
        return k;
        
    }
    static int max=0;
    static void trav(Node r){
        if(r==null){
            return;
        }
        ArrayList<Integer> a=new ArrayList<>();
        inor(r,a);
        if(issorted(a)){
            max=Math.max(max,a.size());
        }
        trav(r.left);
        trav(r.right);
    }
    static boolean issorted(ArrayList<Integer> a){
        if(a.size()==1){
            return true;
        }
        for(int i=1;i<a.size();i++){
            if(a.get(i)<=a.get(i-1)){
                return false;
            }
        }
        return true;
    }
    
    
    static void inor(Node r,ArrayList<Integer> a){
        if(r==null){
            return;
        }
        inor(r.left,a);
      
        a.add(r.data);
        inor(r.right,a);
    }
    
}


    
