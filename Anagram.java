Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not.
  An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, act and tac are an anagram of each other.

Note:-

If the strings are anagrams you have to return True or else return False

|s| represents the length of string s.


Example 1:

Input:a = geeksforgeeks, b = forgeeksgeeks
Output: YES
Explanation: Both the string have same characters with
        same frequency. So, both are anagrams.
Example 2:

Input:a = allergy, b = allergic
Output: NO
Explanation: Characters in both the strings are 
        not same, so they are not anagrams.
  
  
class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        char p[]=a.toCharArray();
        char q[]=b.toCharArray();
        
        if(a.length()!=b.length()) return false;
        Arrays.sort(p);
        Arrays.sort(q);
        
        for(int i=0;i<a.length();i++){
            if(p[i]!=q[i])
            return false;
        }
        return true;
        
    }
}
