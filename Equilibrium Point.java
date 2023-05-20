Given an array A of n positive numbers. The task is to find the first Equilibrium Point in an array. 
Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.

Note: Retun the index of Equilibrium point. (1-based index)

Example 1:

Input: 
n = 5 
A[] = {1,3,5,2,2} 
Output: 3 
Explanation:  
equilibrium point is at position 3 
as elements before it (1+3) = 
elements after it (2+2). 
  
  
  
  
  class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

       int sum = 0; // initialize sum of whole array
        int leftsum = 0; // initialize leftsum
 
        /* Find sum of the whole array */
        for (int i = 0; i < n; i++)
            sum += arr[i];
 
        for (int i = 0; i < n; i++) {
            sum -= arr[i]; // sum is now right sum for index
                           // i
 
            if (leftsum == sum)
                return i+1;
 
            leftsum += arr[i];
        }
 
        /* If no equilibrium index found, then return 0 */
        return -1;
    }
}
