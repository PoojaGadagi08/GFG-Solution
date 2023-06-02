Given an array of N positive integers, print k largest elements from the array. 

Example 1:

Input:
N = 5, k = 2
arr[] = {12,5,787,1,23}
Output: 787 23
Explanation: First largest element in
the array is 787 and the second largest
is 23.
  
  class Solution
{
    //Function to return k largest elements from an array.
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        // code here 
        Arrays.sort(arr);
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=1;i<=k;i++){
            ans.add(arr[n-i]);
        }
        return ans;
        
    }
}
