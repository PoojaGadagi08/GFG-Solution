Given a permutation of first n natural numbers as an array and an integer k. Print the lexicographically largest permutation after at most k swaps.

Example 1:

Input:
n=5
k=3
arr[] = {4, 5, 2, 1, 3}
Output: 5 4 3 2 1
Explanation: Swap 1st and 2nd elements: 5 4 2 1 3 
             Swap 3rd and 5th elements: 5 4 3 1 2 
             Swap 4th and 5th elements: 5 4 3 2 1 
Example 2:

Input:
n=3
k=1
arr[] = {2, 1, 3}
Output: 3 1 2
Explanation: Swap 1st and 3re elements: 3 1 2 

Your Task:
Since, this is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function KswapPermutation() that takes array arr, integer n and integer k as parameters and modifies the array arr and does not return anything.

 

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n).


Constraints:
2 ≤ n ≤ 106

1 ≤ k ≤ n



  void KswapPermutation(long arr[], int n, int k) {

        long pos[] = new long[n + 1];

        for (int i = 0; i < n; ++i)
            pos[(int) arr[i]] = i;

        for (long i = 0; i < n && k > 0; i++) {

            if (arr[(int) i] == n - i)
                continue;

            long temp = pos[(int) (n - i)];

            pos[(int) arr[(int) i]] = pos[(int) (n - i)];
            pos[(int) (n - i)] = i;

            long tmp1 = arr[(int) temp];
            arr[(int) temp] = arr[(int) i];
            arr[(int) i] = tmp1;

            k--;
        }
    }
