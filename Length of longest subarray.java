Given an array A[] of size N, return length of the longest subarray of non- negative integers.

Note: Subarray here means a continuous part of the array.
 

Example 1:

Input : 
N = 9
A[] = {2, 3, 4, -1, -2, 1, 5, 6, 3}
Output : 
4
Explanation :
The subarray [ 1, 5, 6, 3] has longest length 4 and
contains no negative integers
 
Example 2:
Input : 
N = 10
A[] = {1, 0, 0, 1, -1, -1, 0, 0, 1, 0}
Output : 
4
Explanation :
Subarrays [1, 0, 0, 1] and [0, 0, 1, 0] have
equal lengths but sum of first one is greater
so that will be the output.


Your Task:  
You don't need to read input or print anything. Your task is to complete the function longestSubarray() which takes the array A[] and its size N as inputs and returns the length of the longest subarray of non-negative integers.

 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

 

Constraints:
1 <= N <= 105
-105 <= A[i] <= 105




  //User function Template for Java


class Compute {
    
    public long longestSubarry(long A[], int N)
    {
        long x = 0 , max = Integer.MIN_VALUE;
       
        for(int i = 0 ; i < N ; i++){
            if(A[i] >= 0){
                x++;
            }else{
                x = 0;
            }
            if( max < x){
                max = x ;
            }
        }
        return max;
    }


}
