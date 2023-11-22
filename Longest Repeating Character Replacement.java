Given a string S and an integer K. In one operation, you are allowed to choose any character of the string and change it to any other uppercase English character.You can perform this operation atmost K times.
Return the length of the longest substring containing same letter you can get after performing the above operations.
Note : S consists of only uppercase English letters.

Example 1:

Input :
S = "ABBA"
K = 2
Output: 4
Explanation: Replace the 2 occurrences of 'A' with 2 'B's or vice-versa.
Example 2:

Input :
S = "AABAABB"
k = 2
Output: 6
Explanation: Replace the occurrence of 'B' with 'A' and form "AAAAAAB".
The substring "AAAAAA" has the most extended repeating letters, which is 6.
 

Your task :

You don't have to read input or print anything. Your task is to complete the function characterReplacement() which takes the string S and integer K as input and returns the longest substring containing same letter after performing specified operations.

 

Expected Time Complexity : (|S|)

Expected Auxiliary Space : O(1)

 

Constraints :

1 <= |S| <= 105



  // User function Template for Java

class Solution {
    static int characterReplacement(String s, int k) {
        // code here
        int l=s.length();
        if(l==0){
            return 0;
        }
        int c[]=new int[26];
        int i=0;
        int j=0;
        int max=0;
        while(i<l){
            int count=++c[s.charAt(i)-'A'];
            
        
        if(count>max){
            max=count;
        }else{
            k--;
        }
        if(k<0){
            --c[s.charAt(j)-'A'];
            k++;
            j++;
        }
        i++;
    }
    return i-j;
        
    }
}

