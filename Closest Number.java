Given non-zero two integers N and M. The problem is to find the number closest to N and divisible by M. If there are more than one such number, then output the one having maximum absolute value.

 

Example 1:

Input:
N = 13 , M = 4
Output:
12
Explanation:
12 is the Closest Number to
13 which is divisible by 4.
Example 2:

Input:
N = -15 , M = 6
Output:
-18
Explanation:
-12 and -18 are both similarly close to
-15 and divisible by 6. but -18 has
the maximum absolute value.
So, Output is -18



  
//User function Template for Java

class Solution {
    static int closestNumber(int N , int M) {
        // code here
        M = Math.abs(M);
         float x = Math.abs(N/(float)M);
        
        int X = Math.round(x);

        int result =  X*M;

        if(N<0){
             return result*-1;
        } else return result;
    }
};
