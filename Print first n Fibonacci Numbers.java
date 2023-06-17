Given a number N, find the first N Fibonacci numbers. The first two number of the series are 1 and 1.

Example 1:

Input:
N = 5
Output: 1 1 2 3 5
Example 2:

Input:
N = 7
Output: 1 1 2 3 5 8 13


  
//User function Template for Java


class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        //Your code here
        long f=1;
        long s=1;
        //long t=0;
        long ans[]=new long[n];
        
        for(int i=0;i<n;i++){
            ans[i]=f;
             long next=f+s;
             f=s;
             s=next;
        }
        return ans;
    }
}
