// Given a binary tree, find its preorder traversal.
  
  // class Node{
//     int data;
//     Node left,right;
//     Node(int d){
//         data=d;
//         left=right=null;
//     }
// }

class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        ArrayList<Integer> ans=new ArrayList<>();
        help(root,ans);
        return ans;
    }
    public static void help(Node root, ArrayList<Integer> a){
        if(root==null) return ;
        
        a.add(root.data);
        help(root.left,a);
        help(root.right,a);
    }
    

}
