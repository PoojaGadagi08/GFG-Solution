You are given an integer N. You need to convert all zeroes of N to 5.

Example 1:

Input:
N = 1004
Output: 1554
Explanation: There are two zeroes in 1004
on replacing all zeroes with "5", the new
number will be "1554".
  
  
class GfG {
    int convertfive(int num) {
        // Your code here
        String s=Integer.toString(num);
        String a=s.replaceAll("0","5");
        
        return Integer.parseInt(a);
    }
}
