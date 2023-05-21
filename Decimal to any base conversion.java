Given a decimal number N and the base B to which it should be converted. Convert the given number to the given base.

Example 1:

Input:
B = 2
N = 12 

Output:
1100

Explanation:
If the number 12 is converted to a 
number with base 2 we get the binary 
representation of 12 = 1100.




//User function Template for Java
class Solution{
    static String getNumber(int B, int N){
        // code here
        String str = "";
       while(N!=0){
           int d = N%B;
           if(d<=9)
               str=d+str;
           else if(d==10)
               str='A'+str;
           else if(d==11)
               str='B'+str;
           else if(d==12)
               str='C'+str;
           else if(d==13)
               str='D'+str;
           else if(d==14)
               str='E'+str;
           else if(d==15)
               str='F'+str;
           N/=B;
       }
       return str;
    }
}
