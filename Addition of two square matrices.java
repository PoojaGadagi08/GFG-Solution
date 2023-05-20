Given two square matrices matrixA and matrixB of size n x n.  Find the addition of these two matrices.

Note :- You don't have to return anything in this question (Refer YourTask section).
 

Example 1:

Input: matrixA = {{1, 2}, {3, 4}},
matrixB = {{4, 3}, {2, 1}}
Output: {{5, 5}, {5, 5}}

class Solution
{
    public void  Addition(int[][] matrixA, int[][] matrixB)
    {
        // code here
        for(int i = 0; i < matrixA.length; i = i + 1){
            for(int j = 0; j < matrixA[i].length; j++){
                matrixA[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
    }
}
