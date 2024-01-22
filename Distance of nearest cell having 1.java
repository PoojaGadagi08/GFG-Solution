Given a binary grid of n*m. Find the distance of the nearest 1 in the grid for each cell.
The distance is calculated as |i1  - i2| + |j1 - j2|, where i1, j1 are the row number and column number of the current cell, and i2, j2 are the row number and column number of the nearest cell having value 1. There should be atleast one 1 in the grid.
 

Example 1:

Input: grid = {{0,1,1,0},{1,1,0,0},{0,0,1,1}}
Output: {{1,0,0,1},{0,0,1,1},{1,1,0,0}}
Explanation: The grid is-
0 1 1 0 
1 1 0 0 
0 0 1 1 
0's at (0,0), (0,3), (1,2), (1,3), (2,0) and
(2,1) are at a distance of 1 from 1's at (0,1),
(0,2), (0,2), (2,3), (1,0) and (1,1)
respectively.


Example 2:

Input: grid = {{1,0,1},{1,1,0},{1,0,0}}
Output: {{0,1,0},{0,0,1},{0,1,2}}
Explanation: The grid is-
1 0 1
1 1 0
1 0 0
0's at (0,1), (1,2), (2,1) and (2,2) are at a 
distance of 1, 1, 1 and 2 from 1's at (0,0),
(0,2), (2,0) and (1,1) respectively.


 

Yout Task:
You don't need to read or print anything, Your task is to complete the function nearest() which takes the grid as an input parameter and returns a matrix of the same dimensions where the value at index (i, j) in the resultant matrix signifies the minimum distance of 1 in the matrix from grid[i][j].
 

Expected Time Complexity: O(n*m)
Expected Auxiliary Space: O(n*m)

Constraints:
1 ≤ n, m ≤ 500




class Node{
    int first;
    int second;
    int third;
    
    Node(int _first, int _second, int _third){
        this.first=_first;
        this.second=_second;
        this.third=_third;
    }
}


class Solution
{
    //Function to find distance of nearest 1 in the grid for each cell.
    public int[][] nearest(int[][] grid)
    {
        // Code here
        int n =grid.length;
        int m=grid[0].length;
        
        int vis[][]=new int[n][m];
        int dis[][]=new int[n][m];
        
        Queue<Node > q =new LinkedList<>();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1){
                    q.add(new Node(i, j, 0));
                vis[i][j]=1;
                }
                else
                vis[i][j]=0;
            }
        }
        
        int deltaRow[]={-1, 0 , 1, 0};
        int deltaCol[]={0, 1, 0, -1};
        
        
        while(!q.isEmpty()){
            int row=q.peek().first;
            int col = q.peek().second;
            int step = q.peek().third;
            
            q.remove();
            dis[row][col]=step;
            
            for(int i=0;i<4;i++){
                int nRow = row+deltaRow[i];
                int nCol = col+deltaCol[i];
                
                if(nRow>= 0 && nRow<n && nCol>=0 && nCol<m && vis[nRow][nCol] == 0){
                    vis[nRow][nCol]=1;
                    q.add(new Node(nRow, nCol, step+1));
                }
            }
        }
        
        return dis;
    }
}
