class Solution {
    
    public void bfs(ArrayList<ArrayList<Integer>> graph, int node, boolean[]                 visited, ArrayList<Integer> ans) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        while(q.size() > 0) {
            int curr = q.remove();
            if(visited[curr]) continue;
            visited[curr] = true;
            ans.add(curr);
            for(int nbr: graph.get(curr)) {
                if(!visited[nbr]) q.add(nbr);
            }
        }
        return;
    }
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<>();
        bfs(adj, 0, visited, ans);
        return ans;
    }
}

