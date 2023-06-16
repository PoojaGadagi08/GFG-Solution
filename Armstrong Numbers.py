For a given 3 digit number, find whether it is armstrong number or not. An Armstrong number of three digits is an integer such that the sum of the cubes of its
digits is equal to the number itself. Return "Yes" if it is a armstrong number else return "No".
NOTE: 371 is an Armstrong number since 33 + 73 + 13 = 371

Example 1:

Input: N = 153
Output: "Yes"
Explanation: 153 is an Armstrong number
since 13 + 53 + 33 = 153.
Hence answer is "Yes".
  
  
  
#User function Template for python3
class Solution:
    def armstrongNumber (ob, n):
        # code here 
        t=n
        sum=0
        while t>0:
            r=t%10
            sum=sum+(r*r*r)
            t=t//10
        if sum==n:
            return "Yes"
        else:
            return "No"
