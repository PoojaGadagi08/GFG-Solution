Given an integer, check whether it is a palindrome or not.

Example 1:

Input: n = 555
Output: Yes

Example 2:

Input: n = 123
Output: No


//User function Template for Java

class Solution
{
    public String is_palindrome(int n)
    {
        // Code here
        int pali = 0;
        int temp = n;
        while(temp>0)
        {
            int d = temp % 10;
            pali = pali * 10 + d;
            temp = temp/10;
        }
        if(n == pali)
            return "Yes";
        return "No";
    }
}
