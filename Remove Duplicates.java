Given a string without spaces, the task is to remove duplicates from it.

Note: The original order of characters must be kept the same. 

Example 1:

Input: S = "zvvo"
Output: "zvo"
Explanation: Only keep the first
occurrence



//User function Template for Java

class Solution {
    String removeDups(String s) {
       String temp = "" + s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (!temp.contains(String.valueOf(s.charAt(i))))
                temp = temp + s.charAt(i);
        }
        return temp;
    }
}
