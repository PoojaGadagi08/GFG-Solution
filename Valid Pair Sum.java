Given an array of size N, find the number of distinct pairs {i, j} (i != j) in the array such that the sum of a[i] and a[j] is greater than 0.

Example 1:

Input: N = 3, a[] = {3, -2, 1}
Output: 2
Explanation: {3, -2}, {3, 1} are two 
possible pairs.
Example 2:

Input: N = 4, a[] = {-1, -1, -1, 0}
Output: 0
Explanation: There are no possible pairs.
Your Task:  
You don't need to read input or print anything. Complete the function ValidPair() which takes the array a[ ] and size of array N as input parameters and returns the count of such pairs.

Expected Time Complexity: O(N * Log(N))
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 105 
-104  ≤ a[i] ≤ 104




  //User function Template for Java

// class Solution { 
//     static long ValidPair(int a[], int n) { 
//         // Your code goes here
//         long cnt = 0;  // Declare cnt outside the loop

//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if ((a[i] + a[j]) > 0) {
//                     cnt++;
//                 }
//             }
//         }

//         return cnt;
//     }
// }




// class Solution 
// { 
//     static long ValidPair(int a[], int n) 
// 	{ 
// 	    // Your code goes here
// 	    int i=0;int j=i+1;
// 	    int cnt=0;
// 	    while(i<n && j<n){
// 	        if((a[i]+a[j])>0)
// 	        cnt++;
	        
// 	        j++;
	        
// 	        if (j == n) {
//                 i++;
//                 j = i + 1;
//             }
// 	    }
	    

// 	    return cnt;
	    
	    
	    
// 	}
// } 



class Solution 
{ 
    static long ValidPair(int a[], int n) 
	{ 
	    // Your code goes here
	    Arrays.sort(a); // Sort the array in ascending order
        long  count = 0;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (a[left] + a[right] > 0) {
                // If the sum is greater than 0, all pairs with 'right' as the second element are valid
                count += right - left;
                right--;
            } else {
                // If the sum is not greater than 0, move the left pointer to the right
                left++;
            }
        }
        return count;
	    
	}
} 


