Given a positive integer N, write a function to find if it is a power of three or not.

 

Example 1:

Input:
N = 3
Output:
Yes
Explanation:
31 is a power of 3.
  
  
  
//User function Template for Java
class Solution{
    static String isPowerof3(int N){
        // code here
         double p = Math.log10(N)/ Math.log10(3);
        // checking to see if power is an integer or not
        if (p - (int)p == 0)
        return "Yes";
        
        return "No";
    }
}
