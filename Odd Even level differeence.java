Given a Binary Tree. Find the difference between the sum of node values at even levels and the sum of node values at the odd levels.

Example 1:

Input:
            1
          /   \
         2     3

Output: -4

Explanation:
sum at odd levels - sum at even levels
= (1)-(2+3) = 1-5 = -4

Example 2:

Input:
            10
          /    \
        20      30
       /  \         
     40    60      

Output: 60

Explanation:
sum at odd levels - sum at even levels
= (10+40+60) - (20+30)
= 110 - 50
= 60

Your Task:  
You dont need to read input or print anything. Complete the function getLevelDiff() which takes root node as input parameter and returns an integer.
 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(height of tree)







//User function Template for Java

/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
// */
// class Solution
// {
// 	int getLevelDiff(Node root)
// 	{
// 	    //code here
// 	    Queue<Node> q =new LinkedList<>();
// 	    HashMap<Node, Integer> h = new HashMap<>();
	    
// 	    q.offer(root);
// 	    int level=1;
// 	    while(!q.isEmpty()){
// 	        Node cur = q.poll();
	       
// 	        h.put(cur, level);
// 	         level++;
	        
// 	        if(cur.left != null){
// 	            q.offer(cur.left);
// 	        }
// 	        if(cur.right != null){
// 	            q.offer(cur.right);
// 	        }
// 	    }
	    
	    
// 	    int evenSum=0;
// 	    int oddSum=0;
	    
// 	    for(Node n : h.keySet()){
// 	        if(h.get(n) % 2 == 0)
// 	        evenSum+=n.data;
// 	        else 
// 	        oddSum+=n.data;
// 	    }
	    
// 	    return oddSum-evenSum;
// 	}
// }




class Solution
{
    int getLevelDiff(Node root)
    {
        //code here
        Queue<Node> q = new LinkedList<>();
        HashMap<Node, Integer> h = new HashMap<>();

        q.offer(root);
        int level = 1;
        while (!q.isEmpty()) {
            int size = q.size(); // Fix: Use size to iterate over the current level
            for (int i = 0; i < size; i++) {
                Node cur = q.poll();

                h.put(cur, level);

                if (cur.left != null) {
                    q.offer(cur.left);
                }
                if (cur.right != null) {
                    q.offer(cur.right);
                }
            }
            level++; // Fix: Increment level after processing the current level
        }

        int evenSum = 0;
        int oddSum = 0;

        for (Node n : h.keySet()) {
            if (h.get(n) % 2 == 0)
                evenSum += n.data;
            else
                oddSum += n.data;
        }

        return oddSum - evenSum;
    }
}










class Solution{
    int oddsum = 0;
    int evensum = 0;
    void Sum(Node root,int mylevel){
        if(root == null){
            return;
        }
        if(mylevel % 2 == 0){
            evensum += root.data;
        }else{
            oddsum += root.data;
        }
        Sum(root.left,mylevel+1);
        Sum(root.right,mylevel+1);
    }
    int getLevelDiff(Node root){
       Sum(root,1);
       if(oddsum == 0 && evensum == 0){
           return -1;
       }
       return oddsum - evensum;
    }
}
