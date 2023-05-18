Given two positive integers num1 and num2, subtract num2 from num1 on a 12 hour clock rather than a number line.
Note: Assume the Clock starts from 0 hour to 11 hours.

 

Example 1:

Input:
num1 = 7, num2 = 5
Output:
2
Explanation:
7-5 = 2. The time in a 12 hour clock is 2.




//User function Template for Java



//User function Template for Java

class Solution {
    static int subClock(int num1, int num2) {
        int num=num1-num2;
        if(num<0)
        {
           num=-1*num;
           if(num>12)
           {
           num=num%12;
           if(num==0)
           return 0;
           }
           
           return 12-num;
        }
           
        if(num>=12)
        {
        num=num%12;
        }
        
        return num;
    }
};
