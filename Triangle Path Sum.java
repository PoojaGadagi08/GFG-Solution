Given a triangle array, return the minimum path sum to reach from top to bottom.

For each step, you may move to an adjacent number of the row below. More formally, if you are on index i on the current row, you may move to either index i or index i + 1 on the next row.

Example 1:

Input:
n = 4
triangle = [[2],
           [3,4],
          [6,5,7],
         [4,1,8,3]]
Output:
11
Explanation:
     2
   3 4
  6 5 7
 4 1 8 3
The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11.
Example 2:

Input:
n =  1
triangle = [[10]]
Output:
10
Your Task:
You don't have to read input or print anything. Your task is to complete the function minimizeSum() which takes integer n and the triangle and returns the minimum sum to reach from top to bottom.

Constraint:
1 <= triangle.length <= 200
triangle[i].length =  triangle[i-1].length + 1
1 <= triangle[i][j] <= 1000

Expected Time Complexity: O(n * n)
Expected Space Complexity: O(n* n)



  class Solution {
    public static int minimizeSum(int n, ArrayList<ArrayList<Integer> >triangle) {
        // Code here
       
    int[] A = new int[triangle.size()+1];
    for(int i=triangle.size()-1;i>=0;i--){
        for(int j=0;j<triangle.get(i).size();j++){
            A[j] = Math.min(A[j],A[j+1])+triangle.get(i).get(j);
        }
    }
    return A[0];
}
    }
