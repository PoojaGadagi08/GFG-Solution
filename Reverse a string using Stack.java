You are given a string S, the task is to reverse the string using stack.

 

Example 1:


Input: S="GeeksforGeeks"
Output: skeeGrofskeeG
 

Your Task:
You don't need to read input or print anything. Your task is to complete the function reverse() which takes the string S as an input parameter and returns the reversed string.

 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

 

Constraints:
1 ≤ length of the string ≤ 100

 



  class Solution {
    
    public String reverse(String S){
        //code here
        String str="";
        Stack s=new Stack();
        for(int i=0;i<S.length();i++){
            s.push(S.charAt(i));
        }
        while(!s.isEmpty()){
            str+=s.pop();
            
        }
        return str;
    }

}
