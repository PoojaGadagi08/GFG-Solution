A Toeplitz (or diagonal-constant) matrix is a matrix in which each descending diagonal from left to right is constant, i.e., all elements in a diagonal are same.
Given a matrix A of order N X M your task is to complete the function isToeplitz which returns true if the matrix is Toeplitz otherwise returns false.

Example 1:

Input: 3 3 6 7 8 4 6 7 1 4 6 
Output: 1
Explanation:
The test case represents a 3x3 matrix which looks like 
 6 7 8 
 4 6 7 
 1 4 6
Output: 1(True) as values in all diagonals are same.



class GfG
{
    /*You are required to complete this method*/
    boolean isToepliz(int mat[][], int N, int M)
    {
        // Your code here
        for (int i = 1; i < N; i++) {
            for (int j = 1; j < M; j++) {
                // check if each index is equal to its
                // diagonally upper index if not return false
                if (mat[i][j] != mat[i - 1][j - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
