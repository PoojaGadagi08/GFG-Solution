Given a binary tree, find its level order traversal.
Level order traversal of a tree is breadth-first traversal for the tree.


Example 1:

Input:
    1
  /   \ 
 3     2
Output:1 3 2
Example 2:

Input:
        10
     /      \
    20       30
  /   \
 40   60
Output:10 20 30 40 60

Your Task:
You don't have to take any input. Complete the function levelOrder() that takes the root node as input parameter and returns a list of integers containing the level order traversal of the given Binary Tree.


Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)


Constraints:
1 ≤ Number of nodes ≤ 105
1 ≤ Data of a node ≤ 105



  
//User function Template for Java

/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        ArrayList<Integer> ans=new ArrayList<>();
        if(node==null)
        return ans;
        
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        
        while(!q.isEmpty()){
            Node curr=q.remove();
            ans.add(curr.data);
            
            if(curr.left!=null)
            q.add(curr.left);
                
            if(curr.right!=null)
            q.add(curr.right);
        }
        return ans;
    }
}


