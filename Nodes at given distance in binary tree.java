Given a binary tree, a target node in the binary tree, and an integer value k, find all the nodes that are at distance k from the given target node. No parent pointers are available.
Note:

You have to return the list in sorted order.
The tree will not contain duplicate values.
Example 1:

Input:      
          20
        /    \
      8       22 
    /   \
   4    12 
       /   \
      10    14
Target Node = 8
K = 2
Output: 10 14 22
Explanation: The three nodes at distance 2
from node 8 are 10, 14, 22.

Example 2:

Input:      
         20
       /    \
      7      24
    /   \
   4     3
        /  
       1    
Target Node = 7
K = 2
Output: 1 24
Your Task:  
You don't need to read input or print anything. Complete the function KDistanceNodes() which takes the root of the tree, target, and K as input parameters and returns a list of nodes at k distance from target in a sorted order.

Expected Time Complexity: O(N*logN)
Expected Auxiliary Space: O(Height of tree)

Constraints:
1 ≤ N ≤ 105
1 ≤ data of node ≤ 109
1 ≤ target ≤ 109
1 ≤ k ≤ 20




  
//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right;
// }

// class Solution
// {
//     public static void parentPtr(Node root, Map<Node, Node> par) {
//         Queue<Node> q = new LinkedList<>();

//         q.offer(root);

//         while (!q.isEmpty()) {
//             Node cur = q.poll();
//             if (cur.left != null) {
//                 par.put(cur.left, cur);
//                 q.offer(cur.left);
//             }
//             if (cur.right != null) {
//                 par.put(cur.right, cur);
//                 q.offer(cur.right);
//             }
//         }
//     }

//     public static ArrayList<Integer> KDistanceNodes(Node root, int target, int k) {
//         // return the sorted list of all nodes at k dist

//         Map<Node, Node> par = new HashMap<>();
//         parentPtr(root, par);

//         Map<Node, Boolean> vis = new HashMap<>();

//         Queue<Node> q = new LinkedList<>();
//         q.offer(root);

//         vis.put(root, true);

//         int curLevel = 0;

//         while (!q.isEmpty()) {
//             int size = q.size();

//             if (curLevel == k)
//                 break;
//             curLevel++;

//             for (int i = 0; i < size; i++) {
//                 Node cur = q.poll();

//                 if (cur.left != null && vis.get(cur.left) == null) {
//                     q.offer(cur.left);
//                     vis.put(cur.left, true);
//                 }
//                 if (cur.right != null && vis.get(cur.right) == null) {
//                     q.offer(cur.right);
//                     vis.put(cur.right, true);
//                 }
//                 if (par.get(cur) != null && vis.get(par.get(cur)) == null) {
//                     q.offer(par.get(cur));
//                     vis.put(par.get(cur), true);
//                 }
//             }
//         }

//         ArrayList<Integer> res = new ArrayList<>();
//         for (Node node : q) {
//             res.add(node.data);
//         }

//         return res;
//     }

// };







// class Solution
// {
//     public static void parentPtr(Node root, Map<Node, Node> par){
//         Queue<Node> q=new LinkedList<>();
        
//         q.offer(root);
        
//         while(!q.isEmpty()){
//             Node cur=q.poll();
//             if(cur.left != null){
//                 par.put(cur.left, cur);
//                 q.offer(cur.left);
//             }
//             if(cur.right != null){
//                 par.put(cur.right, cur);
//                 q.offer(cur.right);
//             }
//         }
//     }
//     public static ArrayList<Integer> KDistanceNodes(Node root, int target , int k)
//     {
//         // return the sorted list of all nodes at k dist
        
//         Map<Node, Node> par = new HashMap<>();
//         parentPtr(root, par);
        
//         Map<Integer, boolean> vis =new HashMap<>();
        
//         Queue<Integer> q=new LinkedList<>();
//         q.offer(target);
        
//         vis.put(target, true);
        
//         int curLevel=0;
        
        
//         while(!q.isEmpty()){
//             int size=q.size();
            
//             if(curLevel==k) break;
//             curLevel++;
            
//             for(int i=0;i<size;i++){
//                 Node cur=q.poll();
                
//                 if(cur.left != null && vis.get(cur.left)==null){
//                     q.offer(cur.left);
//                     vis.put(cur.left, true);
//                 }
//                 if(cur.right != null && vis.get(cur.right)==null){
//                     q.offer(cur.right);
//                     vis.put(cur.right, true);
//                 }
//                 if(par.get(cur) != null && vis.get(par.get(cur))==null){
//                     q.offer(par.get(cur));
//                     vis.put(par.get(cur), true);
//                 }
//             }
//         }
        
//         ArrayList<Integer> res =new ArrayList<>();
//         while(!q.isEmpty()){
//             int data = q.poll();
//             res.add(data);
//         }
        
//         return res;
//     }
// };








class Solution
{
    public static ArrayList<Integer> KDistanceNodes(Node root, int target , int k)
    {
        ArrayList<Integer> al = new ArrayList<>();
        HashMap<Integer, Node> parent = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        
        queue.offer(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            
            while(size-->0){
                Node cur = queue.poll();
                if(cur.left!=null){
                    parent.put(cur.left.data, cur);
                    queue.offer(cur.left);
                }
                if(cur.right!=null){
                    parent.put(cur.right.data, cur);
                    queue.offer(cur.right);
                }
            }
        }
        
        Node targetNode = find(root, target);

        if(targetNode == null)return al;
        
        queue.offer(targetNode);
        HashMap<Integer, Boolean> vis = new HashMap<>();
        
        while(k>0 && !queue.isEmpty()){
            int size = queue.size();
            while(size-->0){
                Node cur = queue.poll();
                vis.put(cur.data, true);
                if(cur.left!=null && !vis.containsKey(cur.left.data)){
                    queue.offer(cur.left);
                }
                if(cur.right!=null && !vis.containsKey(cur.right.data)){
                    queue.offer(cur.right);
                }
                if(parent.containsKey(cur.data) && !vis.containsKey(parent.get(cur.data).data)){
                    queue.offer(parent.get(cur.data));
                }
            }
            k--;
        }
        
        while(!queue.isEmpty()){
            al.add(queue.poll().data);
        }
        Collections.sort(al);
        return al;
    }
    
    static Node find(Node root, int target){
        if(root == null || root.data == target)return root;
        
        Node left = find(root.left, target);
        Node right = find(root.right, target);
        
        return left == null ? right : left;
    }
};
