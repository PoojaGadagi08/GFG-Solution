Given a Binary Tree of size N, find all the nodes which don't have any sibling. You need to return a list of integers containing all the nodes that don't have a sibling in sorted order.

Two nodes are said to be siblings if they are present at the same level, and their parents are same.

Note: Root node can not have a sibling so it cannot be included in our answer.

Example 1:

Input :
       37
      /   
    20
    /     
  113 

Output: 20 113
Explanation: 20 and 113 dont have any siblings.

Example 2:

Input :
       1
      / \
     2   3 

Output: -1
Explanation: Every node has a sibling.

Your Task:  
You dont need to read input or print anything. Complete the function noSibling() which takes the root of the tree as input parameter and returns a list of integers containing all the nodes that don't have a sibling in sorted order. If all nodes have a sibling, then the returning list should contain only one element -1.


Expected Time Complexity: O(NlogN)
Expected Auxiliary Space: O(Height of the tree)


Constraints:
1 ≤ N ≤ 10^4
All nodes have distinct values.




  class Tree
{
    ArrayList<Integer> noSibling(Node node)
    {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        helper(node, ans);
        if(ans.isEmpty())
        ans.add(-1);
        
        // Collections.sort(ans);
        return ans;
        
        
        
    }
    
    
    void helper(Node node, ArrayList<Integer> list){
        if(node==null || node.left==null && node.right==null)
        return ;
        
        if(node.right==null){
            if(!list.contains(node.left.data)){
                list.add(node.left.data);
            }
        }
        if(node.left==null){
            if(!list.contains(node.right.data)){
                list.add(node.right.data);
            }
        }
        
        helper(node.left, list);
        helper(node.right, list);
    }
}
