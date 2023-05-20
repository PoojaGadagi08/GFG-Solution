Given two positive integers num1 and num2, the task is to find the sum of the two numbers on a 12 hour clock rather than a number line.

Example 1:

Input: num1 = 5, num2 = 7
Output: 0
Explaination: 5+7=12, which in 12 hour 
clock format is 0.


//User function Template for Java

class Solution{
    static int clockSum(int num1, int num2){
        // code here
        int sum = num1 + num2;
        
        int clock = sum%12;
        return clock;
        
    }
}
