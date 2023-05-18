

Given a matrix Grid[][] of size NxN. Calculate the absolute difference between the sums of its diagonals.

Example 1:

Input:
N=3
Grid=[[1,2,3],[4,5,6],[7,8,9]]
Output: 
0
Explanation:
Sum of primary diagonal = 1+5+9 = 15.
Sum of secondary diagonal = 3+5+7 = 15.
Difference = |15 - 15| = 0.

class Solution {
    int diagonalSumDifference(int N, int[][] Grid) {
     int i,sum=0,add=0;
     
     for(i=0;i<N;i++)
     {
         sum += Grid[i][i];
         add += Grid[i][N-1-i];
     }
     return Math.abs(sum-add);
    }
}
