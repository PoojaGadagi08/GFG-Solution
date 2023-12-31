Serialization is to store a tree in an array so that it can be later restored and Deserialization is reading tree back from the array. Now your task is to complete the function serialize which stores the tree into an array A[ ] and deSerialize which deserializes the array to the tree and returns it.
Note: The structure of the tree must be maintained. Multiple nodes can have the same data.
Note : NULL is denoted by -1.

Example 1:

Input:
      1
    /   \
   2     3
Output: 2 1 3
Example 2:

Input:
         10
       /    \
      20    30
    /   \
   40  60
Output: 40 20 60 10 30
Your Task:
The task is to complete two functions serialize which takes the root node of the tree as input and stores the tree into an array and deSerialize which deserializes the array to the original tree and returns the root of it.NULL is denoted by -1.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 <= Number of nodes <= 1000
1 <= Data of a node <= 1000





  class Tree 
{
    //Function to serialize a tree and return a list containing nodes of tree.
	public void serialize(Node root, ArrayList<Integer> A) 
	{
	    //code here
	    if(root == null) A.add(-1);
	    Queue<Node> q = new LinkedList<>();
	    q.add(root);
	    while(!q.isEmpty()){
	        Node node = q.poll();
	        if(node == null){
	            A.add(-1);
	            continue;
	        }
	        A.add(node.data);
	        q.offer(node.left);
	        q.offer(node.right);
	    }
	}
	
	//Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> A)
    {
        //code here
        int n = A.size();
        if(n == 0) return null;
        Queue<Node> q =  new LinkedList<>();
        Node root = new Node(A.get(0));
        q.offer(root);
        for(int i=1;i<n;i++){
            Node parent = q.poll();
            if(A.get(i) != -1){
                Node left = new Node(A.get(i));
                parent.left = left;
                q.offer(left);
            }
            if(A.get(++i) != -1){
                Node right = new Node(A.get(i));
                parent.right = right;
                q.offer(right);
            }
        }
        return root;
    }
};
