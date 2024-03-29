Given a Binary Tree and a target key, you need to find all the ancestors of the given target key.

              1
            /   \
          2      3
        /  \
      4     5
     /
    7
Key: 7
Ancestor: 4 2 1
Example 1:

Input:
        1
      /   \
     2     3
target = 2
Output: 1
Example 2:

Input:
         1
       /   \
      2     3
    /  \   /  \
   4    5 6    8
  /
 7
target = 7
Output: 4 2 1
Your Task:
Your task is to complete the function Ancestors() that finds all the ancestors of the key in the given binary tree.
Note:
The return type is
cpp: vector
Java: ArrayList
python: list

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(H).
Note: H is the height of the tree and this space is used implicitly for the recursion stack.

Constraints:
1 ≤ N ≤ 103
1 ≤ data of node ≤ 104

Company Tags



  class Solution{
    public static boolean Print(Node root,int t,ArrayList<Integer> l){
        if(root == null){
            return false;
        }
        l.add(root.data);
        if(root.data == t){
            return true;
        }
        boolean left = Print(root.left,t,l);
        boolean right = Print(root.right,t,l);
        if(left || right){
            return true;
        }
        l.remove(l.size()-1);
        return false;
    }
    public static ArrayList<Integer> Ancestors(Node root, int target){
        ArrayList<Integer> l = new ArrayList<>();
        Print(root,target,l);
        l.remove(l.size()-1);
        Collections.reverse(l);
        return l;
    }
}
