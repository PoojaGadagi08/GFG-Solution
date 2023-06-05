Given two strings S1 and S2 as input, the task is to merge them alternatively i.e. the first character of S1 then the first character of S2 and so on till the strings end.
NOTE: Add the whole string if other string is empty.

Example 1:

Input:
S1 = "Hello" S2 = "Bye"
Output: HBeylelo
Explanation: The characters of both the 
given strings are arranged alternatlively.
  
  //User function Template for Java
class Solution 
{ 
    String merge(String s1, String s2)
    { 
        // code here
        StringBuilder result = new StringBuilder();
  
        // For every index in the strings
        for (int i = 0; i < s1.length() || i < s2.length(); i++) {
  
            // First choose the ith character of the
            // first string if it exists
            if (i < s1.length())
                result.append(s1.charAt(i));
  
            // Then choose the ith character of the
            // second string if it exists
            if (i < s2.length())
                result.append(s2.charAt(i));
        }
  
        return result.toString();
    }
} 
