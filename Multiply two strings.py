Given two numbers as strings s1 and s2. Calculate their Product.

Note: The numbers can be negative and You are not allowed to use any built-in function or convert the strings to integers.


Example 1:

Input:
s1 = "33"
s2 = "2"
Output:
66

class Solution:
    def multiplyStrings(self,s1,s2):
        # code here
        # return the product string
        a=int(s1)
        b=int(s2)
        return a*b
