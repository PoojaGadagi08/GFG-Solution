Given a binary tree of size N, find its reverse level order traversal. ie- the traversal must begin from the last level.

Example 1:

Input :
        1
      /   \
     3     2

Output: 3 2 1
Explanation:
Traversing level 1 : 3 2
Traversing level 0 : 1
Example 2:

Input :
       10
      /  \
     20   30
    / \ 
   40  60

Output: 40 60 20 30 10
Explanation:
Traversing level 2 : 40 60
Traversing level 1 : 20 30
Traversing level 0 : 10

Your Task: 
You dont need to read input or print anything. Complete the function reverseLevelOrder() which takes the root of the tree as input parameter and returns a list containing the reverse level order traversal of the given tree.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)


Constraints:
1 ≤ N ≤ 10^4

class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (node == null) {
            return ans;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(node);

        while (!q.isEmpty()) {
            Node curr = q.poll();
            
            // Add the current node's value to the front of the ArrayList
            ans.add(0, curr.data);

            // Enqueue right child if present
            if (curr.right != null) {
                q.add(curr.right);
            }

            // Enqueue left child if present
            if (curr.left != null) {
                q.add(curr.left);
            }
        }

        return ans;
    }

    
    
    
    // public void postOrder(Node node, ArrayList<Integer> ans){
    //     if(node==null)
    //     return ;
        
    //     postOrder(node.left, ans);
    //     postOrder(node.right, ans);
    //     ans.add(node.data);
    // }
}      
