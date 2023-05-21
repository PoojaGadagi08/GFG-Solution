Given two force vectors, find out whether they are parallel, perpendicular or neither. Let the first vector be A = a1 i +a2 j + a3 k and the second 
vector be B = b1 i + b2 j + b3 k.

A.B = a1 * b1 + a2 * b2 + a3 * b3

A x B = (a2 * b3 - a3 * b2) i - (a1 * b3 - b1* a3) j + (a1 * b2 - a2 * b1) k

|A|2 = a12 + a22 + a32

If A.B = 0, then A and B are perpendicular.

If |A X B|2 = 0, then A and B are parallel.

Example 1:

Input: A = 3i + 2j + k, B = 6i + 4j + 2k
Output: 1
Explanation: |A X B|2 = 0
  
  class Solution
{
    public int find(int[] A, int[] B)
    {
        // code here
        int dot=A[0]*B[0]+A[1]*B[1]+A[2]*B[2];
        int i=A[1]*B[2]-A[2]*B[1];
        int j=A[0]*B[2]-A[2]*B[0];
        int k=A[0]*B[1]-A[1]*B[0];
        int cross=i*i+j*j+k*k;
        if(dot==0)
           return 2;
        if(cross==0)
           return 1;
        else
            return 0;
        
    }
}
