You are given the root of a complete binary tree. Your task is to find the count of nodes.

A complete binary tree is a binary tree whose, all levels except the last one are completely filled, the last level may or may not be completely filled and Nodes in the last level are as left as possible.

Design an algorithm that runs better than O(n).

Example:

Input: 
root = [1,2,3,4,5,6]
Output: 
6
Explanation: 
There are a total of 6 nodes in the given tree.
Your Task:

Complete the function int cnt_nodes(Node *root), which takes the pointer of the root of the given Binary tree and returns the count of its number of nodes.

Expected Time Complexity: O((LogN)2).

Expected Auxiliary Space: O(Log N).

Constraints:

0 <= N (number of nodes) <= 5 * 104 

0 <= value of nodes <= 5 * 104

The tree is guaranteed to be complete.




  // User function Template for Java

class Solution {
    
    public static int getLeftH(Node node){
        int cnt=0;
        while(node != null){
            node=node.left;
            cnt++;
        }
        return cnt;
    }
    public static int getRightH(Node node){
        int cnt=0;
        while(node != null){
            
            node=node.right;
            cnt++;
        }
        return cnt;
    }

    public static int countNodes(Node root) {
        // Code here
         int l=getLeftH(root);
        int r=getRightH(root);

        if(l ==  r)
        return (1<<l)-1;
        else
        return countNodes(root.left)+countNodes(root.right)+1;
    }
}
