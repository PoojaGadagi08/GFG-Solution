Given a Binary Tree, find maximum and minimum elements in it.

Example 1:

Input: 
           
Output: 11 1
Explanation:                           
 The maximum and minimum element in 
this binary tree is 11 and 1 respectively.
Example 2:

Input: 
           6
        / \
       5   8
      /
     2
Output: 8 2
Your Task:
You don't need to read input or print anything. Your task is to complete findMax() and findMin() functions which take root node of the tree as input parameter and return the maximum and minimum elements in the binary tree respectively.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)


Constraints:
1 <= Number of nodes <= 105
1 <= Data of a node <= 105





  //User function Template for Java

/*
class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    public static int findMax(Node root) {
        // Base case: if the root is null, return a very small value
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        // Recursively find the maximum value in the left and right subtrees
        int leftMax = findMax(root.left);
        int rightMax = findMax(root.right);

        // Compare the maximum values in the left and right subtrees with the root value
        // to find the overall maximum value in the tree
        int currentMax = Math.max(root.data, Math.max(leftMax, rightMax));

        return currentMax;
    }

    public static int findMin(Node root) {
        // Base case: if the root is null, return a very large value
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        // Recursively find the minimum value in the left and right subtrees
        int leftMin = findMin(root.left);
        int rightMin = findMin(root.right);

        // Compare the minimum values in the left and right subtrees with the root value
        // to find the overall minimum value in the tree
        int currentMin = Math.min(root.data, Math.min(leftMin, rightMin));

        return currentMin;
    }
}
