Given a number N, check whether the number is Automorphic number or not.
A number is called Automorphic number if and only if its square ends in the same digits as the number itself.
 

Example 1:

Input: N = 76
Output: Automorphic
Explanation: 762 = 5776 which ends with 
76 therefore it is a automorphic number.



class Solution
{
    public String is_AutomorphicNumber(int n)
    {
        // Code here
        int s=n*n;
        int div;
        
        while(n>0){
            if(n%10!=s%10)
            return "Not Automorphic";
            n/=10;
            s/=10;
        }
        return "Automorphic";
    }
}
