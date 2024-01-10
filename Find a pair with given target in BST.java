Given a Binary Search Tree and a target sum. Check whether there's a pair of Nodes in the BST with value summing up to the target sum. 

Example 1:

Input:
        2
      /   \
     1     3
sum = 5
Output: 1 
Explanation: 
Nodes with value 2 and 3 sum up to 5.
Example 2:

Input:
           6
          /    
         5     
        /
       3 
     /  \
    1    4
sum = 2
Output: 0 
Explanation: 
There's no pair that sums up to 2.
Your Task:
You don't need to read input or print anything. Your task is to complete the function isPairPresent() that takes a root node and a target value as a parameter and returns 1 if there's a pair of Nodes in the BST with values summing up to the target sum, else returns 0. 

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Height of the BST).

Constraints:
1 ≤ Number of Nodes ≤ 105
  
1 ≤ Sum ≤ 106





  class Solution
{
     public class BSTitertator{
        private Stack<Node>s=new Stack<>();
        boolean reverse=true; //before;

        public  BSTitertator(Node root, Boolean isReverse){
            reverse=isReverse;
            pushAll(root);
        }
        public boolean hasNext(){
            return !s.isEmpty();
        }
        public int next(){
            Node temp=s.pop();
            if(reverse==false) pushAll(temp.right);
            else pushAll(temp.left);
            return temp.data;
        }
        public void pushAll(Node root){
            while(root!=null){
                s.push(root);
                if(reverse==false){
                   root=root.left;
                }else{
                    root=root.right;
                }
            }
        }
    }
    
    public int isPairPresent(Node root, int k)
    {
      
        if(root==null)return 0;
        BSTitertator l= new BSTitertator(root,false);
        BSTitertator r= new BSTitertator(root,true);

        int i=l.next();
        int j=r.next();

        while(i<j){
            if(i+j==k)return 1;
            else if(i+j<k)  i =  l.next();
            else j= r.next() ;
        }
        return 0;
        
    }
}

