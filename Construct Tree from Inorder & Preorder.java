Given 2 Arrays of Inorder and preorder traversal. The tree can contain duplicate elements. Construct a tree and print the Postorder traversal. 

Example 1:

Input:
N = 4
inorder[] = {1 6 8 7}
preorder[] = {1 6 7 8}
Output: 8 7 6 1
Example 2:

Input:
N = 6
inorder[] = {3 1 4 0 5 2}
preorder[] = {0 1 3 4 2 5}
Output: 3 4 1 5 2 0
Explanation: The tree will look like
       0
    /     \
   1       2
 /   \    /
3    4   5
Your Task:
Your task is to complete the function buildTree() which takes 3 arguments(inorder traversal array, preorder traversal array, and size of tree n) and returns the root node to the tree constructed. You are not required to print anything and a new line is added automatically (The post order of the returned tree is printed by the driver's code.)

Expected Time Complexity: O(N*N).
Expected Auxiliary Space: O(N).

Constraints:
1<=Number of Nodes<=1000




  class Solution
{
    
    
    public static Node buildTree(int[] preorder, int preStart, int preEnd, int[]
  inorder, int inStart, int inEnd, Map < Integer, Integer > inMap) {
    if (preStart > preEnd || inStart > inEnd) return null;

Node root = new Node(preorder[preStart]);
    int inRoot = inMap.get(root.data);
    int numsLeft = inRoot - inStart;

    root.left = buildTree(preorder, preStart + 1, preStart + numsLeft, inorder, 
    inStart, inRoot - 1, inMap);
    root.right = buildTree(preorder, preStart + numsLeft + 1, preEnd, inorder, 
    inRoot + 1, inEnd, inMap);

    return root;
  }
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        // code here 
         Map < Integer, Integer > inMap = new HashMap < Integer, Integer > ();

    for (int i = 0; i < inorder.length; i++) {
      inMap.put(inorder[i], i);
    }

  Node root = buildTree(preorder, 0, preorder.length - 1, inorder, 0, 
    inorder.length - 1, inMap);
    return root;
    }
}
