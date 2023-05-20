Given a number N, the task is to find the number of diagonals in N sided convex polygon.

Example 1:

Input: N = 5
Output: 5
  
  
  class Solution
{
    public long diagonals(int n) 
    { 
       return (long)n*(n-3)/2; 
    } 
}
