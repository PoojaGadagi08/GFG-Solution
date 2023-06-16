Given a number N. Count the number of digits in N which evenly divides N.

Note :- Evenly divides means whether N is divisible by a digit i.e. leaves a remainder 0 when divided.
 

Example 1:

Input:
N = 12
Output:
2
Explanation:
1, 2 both divide 12 evenly



//User function Template for Java


class Solution{
    static int evenlyDivides(int N){
        // code here
        int count=0, num=N;
        while(num > 0){
        int r=0;
        if(num >=10){
            r = num % 10;
        }else{
            r = num;
        }
           if(r!=0 && N % r ==0){
               count++;
           }
           num = num/10;
        }
        return count;
    }
}
