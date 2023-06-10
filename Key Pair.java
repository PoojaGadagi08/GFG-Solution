Given an array Arr of N positive integers and another number X. Determine whether or not there exist two elements in Arr whose sum is exactly X.

Example 1:

Input:
N = 6, X = 16
Arr[] = {1, 4, 45, 6, 10, 8}
Output: Yes
Explanation: Arr[3] + Arr[4] = 6 + 10 = 16
  
  
  
//User function Template for Java


class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        
    //     int j=0;
    //   for(int i=0;i<n;i++){
    //       if((arr[i]+arr[j])==x)
    //       return true;
    //       else
    //       j++;
          
    //   }
    //   return false;
    HashSet<Integer> h=new HashSet<>();
    
    for(int i=0;i<n;i++){
        int temp=x-arr[i];
        
        if(h.contains(temp))
        return true;
        
        h.add(arr[i]);
    }
    
    return false;
    }
}
