Given an array of distinct elements. Find the third largest element in it.

Suppose you have A[] = {1, 2, 3, 4, 5, 6, 7}, its output will be 5 because it is the 3 largest element in the array A.

Example 1:

Input:
N = 5
A[] = {2,4,1,3,5}
Output: 3
  
  
  
class Solution
{
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	    Arrays.sort(a);
	    return a[n-3];
    }
}
