Given two strings s1 and s2. The task is to check if s2 is a rotated version of the string s1. The characters in the strings are in lowercase.

 

Example 1:

Input:
geeksforgeeks
forgeeksgeeks
Output: 
1
Explanation: s1 is geeksforgeeks, s2 is
forgeeksgeeks. Clearly, s2 is a rotated
version of s1 as s2 can be obtained by
left-rotating s1 by 5 units.
  
  

class Solution
{
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String str1, String str2 )
    {
        // Your code here
         return (str1.length() == str2.length())
            && ((str1 + str1).indexOf(str2) != -1);
    }
    
}
