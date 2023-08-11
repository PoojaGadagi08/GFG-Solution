Given a Binary Tree, return Left view of it. Left view of a Binary Tree is set of nodes visible when tree is visited from Left side. The task is to complete the function leftView(), which accepts root of the tree as argument.

Left view of following tree is 1 2 4 8.

          1
       /     \
     2        3
   /     \    /    \
  4     5   6    7
   \
     8   

Example 1:

Input:
   1
 /  \
3    2
Output: 1 3

Example 2:

Input:

Output: 10 20 40
Your Task:
You just have to complete the function leftView() that returns an array containing the nodes that are in the left view. The newline is automatically appended by the driver code.
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
0 <= Number of nodes <= 100
1 <= Data of a node <= 1000






  //User function Template for Java

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
       ArrayList<Integer> list = new ArrayList<Integer>();
      if(root == null){
          return list;
      }
     
      Queue<Node> queue = new LinkedList<>();
      queue.add(root);
      while(!queue.isEmpty()){
          int n = queue.size();
         
          for(int i=0;i<n;i++){
               Node temp = queue.poll();
              if(i==0){
                  list.add(temp.data);
              }
              if(temp.left!=null){
                  queue.add(temp.left);
              }
              if(temp.right!=null){
                  queue.add(temp.right);
              }
          }
         
      }
       return list;
    }
}
