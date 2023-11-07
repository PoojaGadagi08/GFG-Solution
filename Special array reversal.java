Given a string S, containing special characters and all the alphabets, reverse the string without
affecting the positions of the special characters.

Example 1:

Input: S = "A&B"
Output: "B&A"
Explanation: As we ignore '&' and
then reverse, so answer is "B&A".
Example 2:

Input: S = "A&x#
Output: "x&A#"
Explanation: we swap only A and x.

Your Task:  
You don't need to read input or print anything. Your task is to complete the function reverse() which takes the string as inputs and returns required reverse string.

Expected Time Complexity: O(|S|)
Expected Auxiliary Space: O(|S|)

Constraints:
1 ≤ |S| ≤ 105



  
//User function Template for Java

class Solution
{
    public String reverse(String str)
    {
        char[] s =  str.toCharArray();
        int i=0, j =  s.length-1;
        while(i < j){
            if(!(s[i]>='a' && s[i]<='z') && !(s[i]>='A' && s[i]<='Z')){
                i++;
            }
            else if(!(s[j]>='a' && s[j]<='z') && !(s[j]>='A' && s[j]<='Z')){
                j--;
            }
            else{
                char temp =  s[i];
                s[i] =  s[j];
                s[j] =  temp;
                i++; j--;
                
            }
        }
        return String.valueOf(s);
    }
}

