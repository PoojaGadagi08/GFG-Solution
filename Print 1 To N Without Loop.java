Print numbers from 1 to N without the help of loops.

Example 1:

Input:
N = 10
Output: 1 2 3 4 5 6 7 8 9 10
  
  
  
class Solution
{
    
  public void printNos(int N)
    {
        //Your code here
        if(N>0){
        printNos(N-1);
        System.out.print(N+" ");}
    }
}

