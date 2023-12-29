Given a Binary Tree. Check whether all of its nodes have the value equal to the sum of their child nodes.


Example 1:

Input:
     10
    /
  10 
Output: 1
Explanation: Here, every node is sum of
its left and right child.
Example 2:

Input:
       1
     /   \
    4     3
   /  \
  5    N
Output: 0
Explanation: Here, 1 is the root node
and 4, 3 are its child nodes. 4 + 3 =
7 which is not equal to the value of
root node. Hence, this tree does not
satisfy the given conditions.

Your Task:
You don't need to read input or print anything. Your task is to complete the function isSumProperty() that takes the root Node of the Binary Tree as input and returns 1 if all the nodes in the tree satisfy the following properties. Else, it returns 0.
For every node, data value must be equal to the sum of data values in left and right children. Consider data value as 0 for NULL child.  Also, leaves are considered to follow the property.


Expected Time Complexiy: O(N).
Expected Auxiliary Space: O(Height of the Tree).

 

Constraints:
1 <= N <= 105
1 <= Data on nodes <= 105




  //User function Template for Java


/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node left,right;
	
	Node(int key)
	{
	    data = key;
	    left = right = null;
	}
}

*/
class Tree
{
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    public static int isSumProperty(Node root)
    { 
      int [] a=new int [1];
      a[0]=1;
       func1(root,a);
       
      return a[0]; 
    }
    public static int func1(Node root,int [] a){
      if(root == null)
      return 0;
      if(root.left==null && root.right==null)
      return root.data;   
      
      int val1=func1(root.left,a);
      int val2=func1(root.right,a);
        
        if(root.data!=(val1+val2)){
        a[0]=0;}
        
        return root.data;
    }

}
