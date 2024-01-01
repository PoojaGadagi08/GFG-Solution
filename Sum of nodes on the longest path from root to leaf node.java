Given a binary tree of size N. Your task is to complete the function sumOfLongRootToLeafPath(), that find the sum of all nodes on the longest path from root to leaf node.
If two or more paths compete for the longest path, then the path having maximum sum of nodes is being considered.

Example 1:

Input: 
        4        
       / \       
      2   5      
     / \ / \     
    7  1 2  3    
      /
     6
Output: 13
Explanation:
        4        
       / \       
      2   5      
     / \ / \     
    7  1 2  3 
      /
     6

The highlighted nodes (4, 2, 1, 6) above are 
part of the longest root to leaf path having
sum = (4 + 2 + 1 + 6) = 13
Example 2:

Input: 
          1
        /   \
       2     3
      / \   / \
     4   5 6   7
Output: 11
Your Task:
You don't need to read input or print anything. Your task is to complete the function sumOfLongRootToLeafPath() which takes root node of the tree as input parameter and returns an integer denoting the sum of the longest root to leaf path of the tree. If the tree is empty, return 0.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 <= Number of nodes <= 104
1 <= Data of a node <= 104




  //User function Template for Java

/*
node class of binary tree
class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
*/
// class Solution{
//     public int sumOfLongRootToLeafPath(Node root)
//     {
//         //code here
//         int maxV[] = new int[1];
//         maxV[0] = Integer.MIN_VALUE;
//         sum(root, maxV);
//         return maxV[0];
//     }
    
//     public int sum(Node root, int maxV[]){
//         if(root==null)
//         return 0;
        
//         int left=Math.max(0, sum(root.left, maxV));
//         int right=Math.max(0, sum(root.right, maxV));
        
//         maxV[0]=Math.max(maxV[0], left+right+root.data);
        
//         return Math.max(left,right)+root.data;
//     }
// }


class Solution{
    public int sumOfLongRootToLeafPath(Node root)
    {
        //code here
         if(root==null)
        return 0;
        
        
         ArrayList<Integer> temp=new ArrayList<>();
        int maxSize[]=new int[1];
        int maxSum[]=new int[1];
        temp.add(root.data);
        getPath(root,temp,maxSize,maxSum,root.data);
        
     
        return maxSum[0];
        
        
    }

    
    public void getPath(Node root,ArrayList<Integer> temp,int maxSize[],int maxSum[],int tempSum){
        if(root==null)
        return;
        
        if(root.left==null&&root.right==null)
        {
            if(temp.size()>=maxSize[0]){
               maxSize[0]=temp.size();
               maxSum[0]=tempSum;
            }
            
            return;
        }
        if(root.left!=null){
            temp.add(root.left.data);
            getPath(root.left,temp,maxSize,maxSum,tempSum+root.left.data);
            temp.remove(temp.size()-1);
        }
        if(root.right!=null){
            temp.add(root.right.data);
            getPath(root.right,temp,maxSize,maxSum,tempSum+root.right.data);
            temp.remove(temp.size()-1);
        }
    
    }
}

