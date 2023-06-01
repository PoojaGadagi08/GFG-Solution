Given a string consisting of lowercase letters, arrange all its letters in ascending order. 

Example 1:

Input:
S = "edcab"
Output: "abcde"
Explanation: characters are in ascending
order in "abcde".
  
  
  //User function Template for Java
class Solution 
{ 
    String sort(String s) 
    {
        // code here
    char ch[]=s.toCharArray();
    Arrays.sort(ch);
    return String.valueOf(ch);
    }
} 
