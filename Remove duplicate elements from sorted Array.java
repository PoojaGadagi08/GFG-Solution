Given a sorted array A[] of size N, delete all the duplicated elements from A[]. Modify the array such that if there are X distinct elements in it 
then the first X positions of the array should be filled with them in increasing order and return the number of distinct elements in the array.

Note:
1. Don't use set or HashMap to solve the problem.
2. You must return the number of distinct elements(X) in the array, the generated output will print all the elements of the modified array from index 0 to X-1.

Example 1:

Input:
N = 5
Array = {2, 2, 2, 2, 2}
Output: {2}
Explanation: After removing all the duplicates 
only one instance of 2 will remain.
  
  
  
//User function Template for Java

class Solution {
    int remove_duplicate(int arr[],int n){
        // code here
        // for(int i=0;i<N-1;i++){
        //     if(A[i]!=A[i+1])
        //     break;
        // }
        //return A.length;
        
        
        if (n == 0 || n == 1)
            return n;
      
        // To store index of next unique element
        int j = 0;
      
        // Doing same as done in Method 1
        // Just maintaining another updated index i.e. j
        for (int i = 0; i < n-1; i++)
            if (arr[i] != arr[i+1])
                arr[j++] = arr[i];
      
        arr[j++] = arr[n-1];
      
        return j;
    }
}
