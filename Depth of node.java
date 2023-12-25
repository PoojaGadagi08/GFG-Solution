Given a binary tree, find the depth of the deepest odd level leaf node in a binary tree. If there is no leaf at odd level then return 0.
Consider that level starts with 1. Depth of a leaf node is number of nodes on the path from root to leaf (including both leaf and root).

Example 1:

Input: 
          1
        /    \
       2      3
      / \    / \
     4   5  6   7
Output: 3
Explanation: In the above tree 4,5,6 and 7 are
odd level leaf nodes at depth 3.So the answer is 3.
Example 2:

Input: 
     1
    / \
    2   4
Output: 0
Your task:

You don't need to read input or print anything. Your task is to complete the function depthOfOddLeaf() which takes root node of the tree as input parameter and returns an integer denoting the maximum depth of a odd level leaf node of the tree. If there is no such leaf node return 0.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1<=T<=1000
1<=n<=1000
1<=data of node<=1000





  class Solution{
    int lvl=1;
    public int depthOfOddLeaf(Node root)
    {
        //code here
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int ans=0;
        while(!q.isEmpty()){
            int n = q.size();
            for(int i=0;i<n;i++){
                Node temp = q.poll();
                if(temp.left==null && temp.right==null){
                    if(lvl%2!=0 && lvl>ans){
                        ans = lvl;
                    } 
                }
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
                
            }
            lvl++;
        }
        return ans;
    }
}

