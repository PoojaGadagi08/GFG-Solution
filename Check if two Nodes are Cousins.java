Given the binary Tree of and two-node values. Check whether the two-node values are cousins of each other or not.


Note: Two nodes of a binary tree are cousins if they have the same depth with different parents.

Example 1:

Input:
      1
    /   \
   2     3
a = 2, b = 3
Output: 0

Example 2:

Input:
       1
     /   \ 
    2     3
   /       \
  5         4 
a = 5, b = 4
Output: 1
Explanation: Here, nodes 5 and 4 are
at the same level and have different
parent nodes. Hence, they both are cousins 

Your Task:
You don't need to read input or print anything. Your task is to complete the function isCousins() that takes the root node of the tree (having all nodes distinct), and two integers 'a' and 'b' as inputs. It returns true if the nodes with given values 'a' and 'b' are Cousins of each other and returns false otherwise. 
Two nodes value are cousins of each other if they are at the same level and have different parents. (The driver code will print 1 if the returned values is true,otherwise 0.)

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1<=Number of Nodes<=1000



  
/*
Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
//User function Template for Java

// class Solution {
    
//     // Returns true if the nodes with values 'a' and 'b' are cousins. Else returns false
//     public boolean isCousins(Node root, int a, int b) {
//         // your code here
//         // This function should return true if x and y are cousins, else return false
//         Queue<Node> q =new LinkedList<>();
        
//         q.offer(root);
//         while(!q.isEmpty()){
//             Node cur = q.poll();
            
//             if(cur.left.data == a || cur.left.data==b|| cur.right.data==a || cur.right.data==b)
//             return true;
            
//             if(cur.left!=null)
//             q.offer(cur.left);
            
//             if(cur.right != null)
//             q.offer(cur.right);
            
//         }
        
//                     return false;

//     }

// }



class Solution {
    int par1=0, par2=0, l1=0, l2=0;
    public boolean isCousins(Node root, int a, int b) {
        help(root, a, b, 0, root.data);
        return l1==l2 && par1 != par2 ? true : false;
    }
    public void help(Node root, int a, int b, int level, int prev){
        if(root==null){
            return;
        }
        if(root.data==a){
            l1=level;
            par1=prev;
        }
        if(root.data==b){
            l2=level;
            par2=prev;
        }
        help(root.left, a, b, level+1, root.data);
        help(root.right, a, b, level+1, root.data);
    }
}

