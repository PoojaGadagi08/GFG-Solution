Given a Binary Tree, check if all leaves are at same level or not.

Example 1:

Input: 
            1
          /   \
         2     3

Output: 1

Explanation: 
Leaves 2 and 3 are at same level.

Example 2:

Input:
            10
          /    \
        20      30
       /  \        
     10    15

Output: 0

Explanation:
Leaves 10, 15 and 30 are not at same level.

Your Task: 
You dont need to read input or print anything. Complete the function check() which takes root node as input parameter and returns true/false depending on whether all the leaf nodes are at the same level or not.
 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(height of tree)



  class Solution
{
    boolean check(Node root)
    {
    HashSet<Integer> set = new HashSet<Integer>();
    leafLevel(root,0,set);
    if(set.size()==1)
    return true;
    return false;
    }
    void leafLevel(Node root,int level,HashSet<Integer> set)
    {
        if(root==null)
        return;
        if(root.left==null && root.right==null)
        set.add(level);
        leafLevel(root.left,level+1,set);
        leafLevel(root.right,level+1,set);
    }

}
