Given an array of N strings, find the longest common prefix among all strings present in the array.


Example 1:

Input:
N = 4
arr[] = {geeksforgeeks, geeks, geek,
         geezer}
Output: gee
Explanation: "gee" is the longest common
prefix in all the given strings.
Example 2:

Input: 
N = 2
arr[] = {hello, world}
Output: -1
Explanation: There's no common prefix
in the given strings.

Your Task:
You don't need to read input or print anything. Your task is to complete the function longestCommonPrefix() which takes the string array arr[] and its size N as inputs and returns the longest common prefix common in all the strings in the array. If there's no prefix common in all the strings, return "-1".


Expected Time Complexity: O(N*min(|arri|)).
Expected Auxiliary Space: O(min(|arri|)) for result.





  
//User function Template for Java


// Approach 1 - Sort the aray And compare the first and last elememnt
class Solution{
    String longestCommonPrefix(String strs[], int n){
        // code he
       String p=strs[0];
        
        
        for(int i=1;i<strs.length;i++)
        {
            while(strs[i].indexOf(p)!=0)
            {
                p=p.substring(0,p.length()-1);
            }
        }
   
        return p.length()==0?"-1":p;
    }

}
