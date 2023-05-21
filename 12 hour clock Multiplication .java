Given two positive integers num1 and num2, the task is to find the product of the two numbers on a 12 hour clock rather than a number line.
Note: Assume the Clock starts from 0 hour to 11 hours.

 

Example 1:

Input:
num1 = 2, num2 = 3
Output:
6
Explanation:
2*3 = 6. The time in a 12 hour clock is 6.
  
  class Solution {
    static int mulClock(int num1, int num2) {
        int t=num1*num2;
        int y=t;
        while(t>=12)
        {
             y=t-12;
             t=y;
        }
         return y;
    }
};
