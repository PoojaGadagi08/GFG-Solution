Given an array arr of N integers, write a function that returns true if there is a triplet (a, b, c) that satisfies a2 + b2 = c2, otherwise false.

Example 1:

Input:
N = 5
Arr[] = {3, 2, 4, 6, 5}
Output: Yes
Explanation: a=3, b=4, and c=5 forms a
pythagorean triplet.
Example 2:

Input:
N = 3
Arr[] = {3, 8, 5}
Output: No
Explanation: No such triplet possible.
Your Task:
Complete the function checkTriplet() which takes an array arr, single integer n, as input parameters and returns boolean denoting answer to the problem. You don't to print answer or take inputs. 
Note: The driver will print "Yes" or "No" instead of boolean.

Expected Time Complexity: O(max(Arr[i])2)
Expected Auxiliary Space: O(max(Arr[i]))




  
//User function Template for Java



class Solution {
    boolean checkTriplet(int[] arr, int n) {
        // code here
        for(int i=0;i<n;i++){
            arr[i]=arr[i]*arr[i];
        }
        Arrays.sort(arr);
        
        for(int i=n-1;i>=2;i--){
            int l=0;
            int r=i-1;
            
            while(l<r){
                if(arr[l]+arr[r]==arr[i]) return true;
                else if(arr[l]+arr[r]<arr[i]) l++;
                else r--;
            }
        }
        return false;
    }
}
