Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.


Example 1:

Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated 
into ascending order.
Example 2:

Input: 
N = 3
arr[] = {0 1 0}
Output:
0 0 1
Explanation:
0s 1s and 2s are segregated 
into ascending order.

Your Task:
You don't need to read input or print anything. Your task is to complete the function sort012() that takes an array arr and N as input parameters and sorts the array in-place.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

  
class Solution
{
    public static void sort012(int n[], int a)
    {
        // code here 
        int c0=0;
        int c1=0;
        int c2=0;

        for(int i=0;i<n.length;i++){
            if(n[i]==0)
            c0++;
            else if(n[i]==1)
            c1++;
            else
            c2++;
        }
        for(int i=0;i<n.length;i++){
            if(c0>0){
                n[i]=0;
                c0--;
            }
            else if(c1>0){
                n[i]=1;
                c1--;
            }
            else{
                n[i]=2;
                c2--;
            }
        }
    }
}
