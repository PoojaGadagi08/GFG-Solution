Consider a sample space S consisting of all perfect squares starting from 1, 4, 9 and so on. You are given a number N, 
you have to output the number of integers less than N in the sample space S.

 

Example 1:

Input :
N = 9
Output:
2
Explanation:
1 and 4 are the only Perfect Squares
less than 9. So, the Output is 2.
  
  
  //User function Template for Java

class Solution {
    static int countSquares(int N) {
        int sqrt = mysqrt(N);
        return sqrt - 1;
    }
    static int mysqrt(int N) {
        int s = 1, e = N;
        int cnt = 0;
        while (s <= e){
            int m = s + (e - s)/2;
            if (m <= N/m){
                if (N%m == 0 && m == N/m){
                    return m;
                }
                s = m + 1;
            }
            else e = m - 1;
        }
        return s;
    }
}
