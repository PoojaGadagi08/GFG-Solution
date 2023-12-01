Given a string S, find the length of the longest substring without repeating characters.


Example 1:

Input:
S = "geeksforgeeks"
Output:
7
Explanation:
Longest substring is
"eksforg".
Example 2:

Input:
S = "abdefgabef"
Output:
6
Explanation:
Longest substring are
"abdefg" , "bdefga" and "defgab".
 

Your Task:
You don't need to take input or print anything. Your task is to complete the function longestUniqueSubsttr() which takes a string S as and returns the length of the longest substring.

 

Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(K) where K is constant.


Constraints:
1 ≤ |S| ≤ 105
It is guaranteed that all characters of the String S will be lowercase letters from 'a' to 'z'








class Solution{
    int longestUniqueSubsttr(String s){
        int n= s.length();
        int left=0;
        int right=0;
        int len = 0;
        HashSet<Character> h= new HashSet<>();
        while(right<n){
            char currChar = s.charAt(right);
            
            if(!h.contains(currChar)){
                h.add(s.charAt(right));
                right++;
               if (right - left > len) {
                   len=right-left;
                }
            } else {
                h.remove(s.charAt(left));
                left++;
            }
        
                    }
                    
                    return len;
        }
    }
