Given N, count all ‘a’(>=1) and ‘b’(>=0) that satisfy the condition a3 + b3 = N.

 

Example 1:

Input:
N = 9 
Output:
2
Explanation:
There are two solutions: (a=1, b=2)
and (a=2, b=1).

Example 2:

Input:
N = 27
Output:
1
Explanation:
Thereis only one solution: (a=3, b=0)
 

Your Task:
You don't need to read input or print anything. Your task is to complete the function pairCubeCount() which takes an Integer N as input and returns the answer.

 

Expected Time Complexity: O(cbrt(N))
Expected Auxiliary Space: O(1)


  
class Solution {
   static int pairCubeCount(int N) {
    int count = 0;
    for (int a = 1; a*a*a <= N; a++) {
        int b = (int) Math.cbrt(N - a*a*a);
        if (a*a*a + b*b*b == N) { 
            count++;
        }
    }
    return count;
    }
};
