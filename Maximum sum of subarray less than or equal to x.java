
Given an array arr[] of integers of size N and a number X, the task is to find the sum of subarray having maximum sum less than or equal to the given value of X.

Example 1:

Input: N = 5, X = 11
arr[] = {1, 2, 3, 4, 5} 
Output:  10
Explanation: Subarray having maximum 
sum is {1, 2, 3, 4}.
 
Example 2:

Input: N = 5, X = 7
arr[] = {2, 4, 6, 8, 10} 
Output:  6
Explanation: Subarray having maximum 
sum is {2, 4} or {6}.
 

Your Task:
This is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function calculateMaxSumLength() that takes array arr, integer N, and integer X as parameters and returns maximum sum of any subarray that is less than or equal to x.

 

Expected Time Complexity: O(N). 
Expected Auxiliary Space: O(1).

 

Constraints:
1 ≤ N ≤ 106
1 ≤ arr[i] ≤ 104



  class Solution
{
    long findMaxSubarraySum(long arr[], int n,int sum)
    {
        // Your code goes here
         int i=0,j=0;
         long s=0,ans=0;
        while(j<n){
            s+=arr[j];
            if(s>sum){
                while(i<n && s>sum){
                    s-=arr[i];
                    i++;
                }
            }
            ans=Math.max(ans,s);//8 
            j++;
        }
        return ans;

    }
}
