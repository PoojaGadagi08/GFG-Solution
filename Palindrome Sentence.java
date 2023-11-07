Given a single sentence s, check if it is a palindrome or not. Ignore white spaces and any other character you may encounter. 

Example 1:

Input:
s = race car.
Output: 1 
Explanation: processing str gives us
"racecar" which is a palindrome.

Example 2:

Input:
s = hello world.
Output: 0
Explanation: processing str gives us
"helloworld" which is not a palindrome.

Your Task:  
You dont need to read input or print anything. Complete the function sentencePalindrome() which takes a string s as input parameter and returns a boolean value denoting if sentence is a palindrome or not.

Note: The driver code prints 1 if the returned value is true, otherwise 0.


Expected Time Complexity: O(N) where N is length of s.
Expected Auxiliary Space: O(1)


Constraints:
1<= s.length() <= 104
All the alphabets used in the sentence are in lower case.




  class Solution { 

    static boolean sentencePalindrome(String s) { 
        int l=0;
        int r=s.length()-1;
        
        while(l<=r){
            while(l<r && !Character.isLetterOrDigit(s.charAt(l))) l++;
            
             while(l<r && !Character.isLetterOrDigit(s.charAt(r))) r--;
             
             while(l<r && Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))) return false;
             
             l++;
             r--;
            
        }
        return true;
    }
}
