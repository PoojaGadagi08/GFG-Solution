Given an array containing N integers and an integer K., Your task is to find the length of the longest Sub-Array with the sum of the elements equal to the given value K.

 

Example 1:
 

Input :
A[] = {10, 5, 2, 7, 1, 9}
K = 15
Output : 4
Explanation:
The sub-array is {5, 2, 7, 1}.
Example 2:

Input : 
A[] = {-1, 2, 3}
K = 6
Output : 0
Explanation: 
There is no such sub-array with sum 6.
Your Task:
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function lenOfLongSubarr() that takes an array (A), sizeOfArray (n),  sum (K)and returns the required length of the longest Sub-Array. The driver code takes care of the printing.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

 

Constraints:
1<=N<=105
-105<=A[i], K<=105





//User function Template for Java

//User function Template for Java

class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        Map<Integer, Integer> h=new HashMap<>();
        int sum=0;
        int maxlen=0;
        
        for(int i=0;i<N;i++){
            sum+=A[i];
            
            if(sum==K)
            maxlen=Math.max(maxlen,i+1);
            
            int rem=sum-K;
            
            if(h.containsKey(rem)){
                int len=i-h.get(rem);
                maxlen=Math.max(maxlen,len);
            }
            
            if(!h.containsKey(sum)){
                h.put(sum,i);
            }
        }
        return maxlen;
    }
    
    
}


//User function Template for Java

// class Solution{
    
   
//     // Function for finding maximum and value pair
//     public static int lenOfLongSubarr (int a[], int n, int k) {
//         //Complete the function
//         // size of the array.

//         int left = 0, right = 0; // 2 pointers
//         long sum = a[0];
//         int maxLen = 0;
//         while (right < n) {
//             // if sum > k, reduce the subarray from left
//             // until sum becomes less or equal to k:
//             while (left <= right && sum > k) {
//                 sum -= a[left];
//                 left++;
//             }

//             // if sum = k, update the maxLen i.e. answer:
//             if (sum == k) {
//                 maxLen = Math.max(maxLen, right - left + 1);
//             }

//             // Move forward thw right pointer:
//             right++;
//             if (right < n) sum += a[right];
//         }

//         return maxLen;
//     }
    
    
// }




