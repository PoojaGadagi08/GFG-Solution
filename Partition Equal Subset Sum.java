Given an integer array nums, return true if you can partition the array into two subsets such that the sum of the elements in both subsets is equal or false otherwise.

 

Example 1:

Input: nums = [1,5,11,5]
Output: true
Explanation: The array can be partitioned as [1, 5, 5] and [11].
Example 2:

Input: nums = [1,2,3,5]
Output: false
Explanation: The array cannot be partitioned into equal sum subsets.
 

Constraints:

1 <= nums.length <= 200
1 <= nums[i] <= 100


  class Solution{
public:
    int equalPartition(int N, int arr[])
    {
        // code here
        int S = 0;
        for(int i = 0; i < N; i++){
            S += arr[i];
        }
        if(S % 2 == 0){
            S /= 2;
            vector<int>dp(S+1,0); dp[0] = 1;
            for(int i = 0; i < N; i++){
                for(int j = S; j >= 0; j--){
                    if(j - arr[i] >= 0){
                        dp[j] |= dp[j - arr[i]];
                    }
                }
            }
            return dp[S];
        }
        else{
            return 0;
        }
    }
};
