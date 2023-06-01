Given a string S, the task is to create a string with the first letter of every word in the string.
 

Example 1:

Input: 
S = "geeks for geeks"
Output: gfg


class Solution {
    String firstAlphabet(String S) {
        // code here
        boolean v=true;
        String ans="";
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)==' ')
            v=true;
            if(S.charAt(i)!=' '){
                if(v==true){
                ans+=S.charAt(i);
                v=false;
                    
                }
            }
        }
        return ans;
    }
};
