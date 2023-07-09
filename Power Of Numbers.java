Given a number and its reverse. Find that number raised to the power of its own reverse.
Note: As answers can be very large, print the result modulo 109 + 7.

Example 1:

Input:
N = 2
Output: 4
Explanation: The reverse of 2 is 2 and after raising power of 2 by 2 we get 4 which gives remainder as 4 when divided by 1000000007.
Example 2:

Input:
N = 12
Output: 864354781
Explanation: The reverse of 12 is 21and 1221 when divided by 1000000007 gives remainder as 864354781.
Your Task:
You don't need to read input or print anything. You just need to complete the function pow() that takes two parameters N and R denoting the input number and its reverse and returns power of (N to R)mod(109 + 7).

Expected Time Complexity: O(LogN).
Expected Auxiliary Space: O(LogN).




  
//User function Template for Java

class Solution
{
        
    long power(int N,int R)
    {
        //Your code here
        int MOD =1000000007;
        if(N==0) return 0;
        if(R==0) return 1;
        
        if(R%2==0)
        {
            long ans = power(N,R/2);
            return (ans%MOD * ans%MOD)%MOD;
        }
        else{
            long ans = power(N,(R-1)/2);
            return (ans%MOD * ans%MOD * N%MOD)%MOD;
        }
        
    }

}
