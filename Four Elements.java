Given an array A of N integers. You have to find whether a combination of four elements in the array whose sum is equal to a given value X exists or not.
 

Example 1:

Input:
N = 6
A[] = {1, 5, 1, 0, 6, 0}
X = 7
Output:
1

Explantion:
1, 5, 1, 0 are the four elements which makes sum 7.
 


Your Task:  
You don't need to read input or print anything. Your task is to complete the function find4Numbers() which takes the array A[], its size N and an integer X as inputs and returns true if combination is found else false. Driver code will print 1 or 0 accordingly.

 

Expected Time Complexity: O(N3)
Expected Auxiliary Space: O(1)

 

Constraints:
4 <= N <= 100
1 <= A[i] <= 1000







class Compute
{
    boolean find4Numbers(int arr[], int n, int X) 
    {
       
       
       if(n<4)
       return false;
      
      
      
      Arrays.sort(arr);
       
       
       for(int i=0;i<=n-4;i++){
           for(int j=i+1;j<=n-3;j++){
               int low=j+1;
               int high=n-1;
               while(low<high){
                   int sum=arr[low]+arr[high]+arr[i]+arr[j];
                   if(sum==X)
                   return true;
                   else if(sum<X)
                   low++;
                   else 
                   high--;
               }
           }
       }
       
       return false;
       
       
    }
}

