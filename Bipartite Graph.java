Given an adjacency list of a graph adj  of V no. of vertices having 0 based index. Check whether the graph is bipartite or not.
 

Example 1:

Input: 

Output: 1
Explanation: The given graph can be colored 
in two colors so, it is a bipartite graph.
Example 2:

Input:

Output: 0
Explanation: The given graph cannot be colored 
in two colors such that color of adjacent 
vertices differs. 
 

Your Task:
You don't need to read or print anything. Your task is to complete the function isBipartite() which takes V denoting no. of vertices and adj denoting adjacency list of the graph and returns a boolean value true if the graph is bipartite otherwise returns false.
 

Expected Time Complexity: O(V + E)
Expected Space Complexity: O(V)

Constraints:
1 ≤ V, E ≤ 105



  class Solution
{
    
    // public boolean dfs(int node, int col, int color[], ArrayList<ArrayList<Integer>>adj){
    //     color[node] = col;
    //     for(int i : adj.get(node)){
    //         if(color[i]==-1){
    //         if(dfs(i, 1-col, color, adj)==false)
    //         return false; 
    //         }
    //         else if(color[i]==col)
    //         return false;
    //     }
    //     return true;
    // }
    // public boolean isBipartite(int v, ArrayList<ArrayList<Integer>>adj)
    // {
    //     // Code here
    //     int color[]=new int [v];
    //     for(int i : color)
    //     color[i]=-1;
        
    //     for(int i=0;i<v;i++){
    //         if(color[i]==-1){
    //         if(dfs(i, 0, color, adj)==false)
    //         return false;
    //         }
    //     } 
        
    //     return true;
    
    private boolean dfs(int node, int col, int color[], 
    ArrayList<ArrayList<Integer>>adj) {
        
        color[node] = col; 
        
        // traverse adjacent nodes
        for(int it : adj.get(node)) {
            // if uncoloured
            if(color[it] == -1) {
                if(dfs(it, 1 - col, color, adj) == false) return false; 
            }
            // if previously coloured and have the same colour
            else if(color[it] == col) {
                return false; 
            }
        }
        
        return true; 
    }
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        int color[] = new int[V];
	    for(int i = 0;i<V;i++) color[i] = -1; 
	    
	    // for connected components
	    for(int i = 0;i<V;i++) {
	        if(color[i] == -1) {
	            if(dfs(i, 0, color, adj) == false) return false; 
	        }
	    }
	    return true; 
    
    }
}
