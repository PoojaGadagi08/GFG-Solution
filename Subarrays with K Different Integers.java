Given an integer array arr of size N and an integer k, return the number of good subarrays of arr.
A good array is an array where the number of different integers in that is exactly k.

For example, {1, 3, 4, 4, 1} has 3 different integers: 1, 3, and 4.
Note : A subarray is a contiguous part of an array.

Example 1:

Input:
N = 5
k = 2
arr[ ] = {1, 2, 1, 2, 3}
Output: 7
Explanation: Subarrays formed with exactly 2 different integers: {1, 2}, {2, 1}, {1, 2}, {2, 3}, {1, 2, 1}, {2, 1, 2}, {1, 2, 1, 2}.
 

Example 2:

Input:
N = 5
k = 3
arr[ ] = {1, 2, 1, 3, 4}
Output: 3
 

Your Task:
You don't need to read input or print anything. Your task is to complete the function subarrayCount() which takes the array of integers arr , an integer N and k as parameters and returns a number of good subarrays.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 ≤ N ≤ 105
1 ≤ k ≤ N
1 ≤ arri  ≤ N




  class Solution {
   static  int atMostK(int[] A, int K) {
        int i = 0, res = 0;
        Map<Integer, Integer> count = new HashMap<>();
        for (int j = 0; j < A.length; ++j) {
            if (count.getOrDefault(A[j], 0) == 0) K--;
            count.put(A[j], count.getOrDefault(A[j], 0) + 1);
            while (K < 0) {
                count.put(A[i], count.get(A[i]) - 1);
                if (count.get(A[i]) == 0) K++;
                i++;
            }
            res += j - i + 1;
        }
        return res;
    }
    static int subarrayCount(int A[], int N, int K) {
    // code here
    return atMostK(A, K) - atMostK(A, K - 1);

  }
}
     
