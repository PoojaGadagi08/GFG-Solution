Given a BST and an integer K. Find the Kth Smallest element in the BST using O(1) extra space. 

Example 1:

Input:
      2
    /   \
   1     3
K = 2
Output: 2
Explanation: 2 is the 2nd smallest element in the BST

Example 2:

Input:
        2
      /  \
     1    3
K = 5
Output: -1
Explanation: There is no 5th smallest element in the BST as the size of BST is 3
 

Your Task:
You don't need to read input or print anything. Your task is to complete the function KthSmallestElement() which takes the root of the BST and integer K as inputs and returns the Kth smallest element in the BST, if no such element exists return -1.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1<=Number of nodes<=10^5

 



  /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
      // better keep these two variables in a wrapper class
  private static int number = 0;
  private static int count = 0;

  public int kthSmallest(TreeNode root, int k) {
      count = k;
      helper(root);
      return number;
  }
  
  public void helper(TreeNode n) {
      if (n.left != null) helper(n.left);
      count--;
      if (count == 0) {
          number = n.val;
          return;
      }
      if (n.right != null) helper(n.right);
  }
}
