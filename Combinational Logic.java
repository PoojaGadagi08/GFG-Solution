Construct a 6 input gate which performs the following logical operation:
 (not(A)).B + C.D +E.(not(F))
where A, B, C, D, E and F are the inputs to the 6 input gate.

Example 1:

Input: A = 1, B = 1, C = 0
       D = 0, E = 1, F = 1
Output: 0 
Explanation: (not(A)).B + C.D +E.(not(F))
= (not(1)).1 + 0.0 +1.(not(1)) = 0.
  
  class Solution {
    static int logicalOperation(int A,int B,int C,int D,int E,int F){
        // code here
        return ~A & B |C&D| E& ~F;
    }
}
