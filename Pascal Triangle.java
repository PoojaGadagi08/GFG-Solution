Given a positive integer N, return the Nth row of pascal's triangle.
Pascal's triangle is a triangular array of the binomial coefficients formed by summing up the elements of previous row.

Example :
1
1 1
1 2 1
1 3 3 1
For N = 3, return 3rd row i.e 1 2 1

Example 1:

Input:
N = 4
Output: 1 3 3 1
Explanation: 4th row of pascal's triangle
is 1 3 3 1.
Example 2:

Input:
N = 5
Output: 1 4 6 4 1
Explanation: 5th row of pascal's triangle
is 1 4 6 4 1.
 

Your Task:
Complete the function nthRowOfPascalTriangle() which takes n, as input parameters and returns an array representing the answer. The elements can be large so return it modulo 109 + 7. You don't to print answer or take inputs.

Expected Time Complexity: O(N2)
Expected Auxiliary Space: O(N2)




  // User function Template for Java

// class Solution {
//     ArrayList<Long> nthRowOfPascalTriangle(int n) {
//         // code here
//         ArrayList<Long> ans=new ArrayList<>();
        
//         long a=1L;
//         ans.add(a);
        
//         for(int i=1;i<n;i++){
//             a=a*(n-i);
//             a=a/i;
            
//             ans.add(a);
//         }
//         return ans;
//     }
// }


class Solution {
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<Long> pre = null;
        ArrayList<Long> row = null;
        
        for(int i=0; i<n; i++){
            row = new ArrayList<>();
            for(int j = 0; j<=i; j++){
                if(j==0 || j==i){
                    Long val = (long)1;
                    row.add(val);
                }
                else{
                    row.add(((long)pre.get(j-1) + (long)pre.get(j))%1000000007);
                }
            }
            pre = row;
        }
        return pre;
    }
}
