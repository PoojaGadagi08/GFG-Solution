The task is to find the smallest number with given sum of digits as S and number of digits as D.

 

Example 1:

Input:
S = 9 
D = 2
Output:
18
Explanation:
18 is the smallest number
possible with sum = 9
and total digits = 2.
 

Example 2:

Input:
S = 20
D = 3
Output:
299
Explanation:
299 is the smallest number
possible with sum = 20
and total digits = 3.
 

Your Task:

You don't need to read input or print anything. Your task is to complete the function smallestNumber() which takes the two integers S and D and returns a string which is the smallest number if possible, else return "-1".

 

Expected Time Complexity: O(D)
Expected Auxiliary Space: O(1)

 

Constraints:
1 ≤ S ≤ 100
1 ≤ D ≤ 6




  class Solution{
    static String smallestNumber(int sum, int digits){
        // code here
          int[] result = new int[digits];
        result[0] = 1;
        sum--;

        for (int i = digits - 1; i > 0; i--) {
            int d = Math.min(9, sum);
            result[i] = d;
            sum -= d;
        }

        result[0] += sum;

        // Convert the array to a String
        StringBuilder stringBuilder = new StringBuilder();
        for (int digit : result) {
            stringBuilder.append(digit);
        }

        return stringBuilder.toString();
    }
}
