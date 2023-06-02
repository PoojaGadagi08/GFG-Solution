Given a string str containing alphanumeric characters. The task is to calculate the sum of all the numbers present in the string.

Example 1:

Input:
str = 1abc23
Output: 24
Explanation: 1 and 23 are numbers in the
string which is added to get the sum as
24.



class Solution
{
    //Function to calculate sum of all numbers present in a string.
    public static long findSum(String str)
    {
        // your code here
        String temp="0";
        int sum=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            
            if(Character.isDigit(ch)){
                temp+=ch;
                
            }else{
                sum+=Integer.parseInt(temp);
                temp="0";
            }
        }
        return sum+Integer.parseInt(temp);
    }
    
}
