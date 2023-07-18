Given a string consisting of lowercase english alphabets. Find the repeated character present first in the string.

Example 1:

Input:
S = "geeksforgeeks"
Output: g
Explanation: g, e, k and s are the repeating
characters. Out of these, g occurs first. 
Example 2:

Input: 
S = "abcde"
Output: -1
Explanation: No repeating character present.

Your Task:
You don't need to read input or print anything. Your task is to complete the function firstRep() which takes the string S as input and returns the the first repeating character in the string. In case there's no repeating character present, return '#'.


Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(1).






  
//User function Template for Java
class Solution
{
    char firstRep(String s)
    {
        for(int i =0; i<s.length()-1;i++){
            for(int j =i+1;j<s.length(); j++){
                if(s.charAt(i)==s.charAt(j))
                return s.charAt(i);
            }
        }
        return '#';
    }
}
