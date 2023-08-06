Given an array arr[] of size N and an integer K, the task is to left rotate the array K indexes

Example 1:

Input: N = 7, K = 2
arr[] = {1, 2, 3, 4, 5, 6, 7}
Output: 3 4 5 6 7 1 2
Explanation: Rotation of the above 
array by 2 will make the output array .

Example 2:

Input: N = 6, K = 12
arr[] = {1, 2, 3, 4, 5, 6}
Output: 1 2 3 4 5 6

Your Task:
This is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function leftRotate() that takes array arr, integer K and integer N as parameters and rotate the given array by k value. You have to rotate array even the k is greater than n. In these case after every n rotation array comes same as the original array.

 

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

 

Constraints:
1 ≤ N ≤ 105
1 ≤ K ≤ 105
-100 ≤ arr[i] ≤ 100




class Solution:
    def leftRotate(self, arr, k, n):
        # Your code goes here
        k=k%n
        temp = []
        # Storing in temp array till kth index
        for i in range(k):
            temp.append(arr[i])
        # Storing the remaining elements in order
        for i in range(k,n):
            arr[i-k]=arr[i]
        # appending the elements from temp to original array
        for i in range(n-k,n):
            arr[i]=temp[i-(n-k)]
        return arr
