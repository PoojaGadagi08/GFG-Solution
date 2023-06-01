Given and integer N.Calculate the sum of series 13 + 23 + 33 + 43 + … till N-th term.

Example 1:

Input:
N=5
Output:
225
Explanation:
13+23+33+43+53=225

// User function Template for Java

// class Solution {
//     long sumOfSeries(long n) {
//         // code here
//         long sum=0;
//         // for(long i=1;i<n+1;i++){
//         //     sum+=Math.pow(i,3);
//         // }
//         // return sum;
//         //Sum of the series 13 + 23 + 33 + … + n3 = (n (n+1)/2)2
//         // sum=(long)Math.pow(((n*(n+1))/2),2);
//         // return sum;
        
        
        
//     }
// }



// User function Template for Java

class Solution {
    long sumOfSeries(long N) {
        long sum=0;
        for(long i=1;i<=N;i++)
        {
         sum =sum+i*i*i;
        }
        return sum;
        // code here
    }
}
