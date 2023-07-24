Given two strings s1 and s2. Modify both the strings such that all the common characters of s1 and s2 are to be removed and the uncommon characters of s1 and s2 are to be concatenated.
Note: If all characters are removed print -1.

Example 1:

Input:
s1 = aacdb
s2 = gafd
Output: cbgf
Explanation: The common characters of s1
and s2 are: a, d. The uncommon characters
of s1 and s2 are c, b, g and f. Thus the
modified string with uncommon characters
concatenated is cbgf.
Example 2:

Input:
s1 = abcs
s2 = cxzca
Output: bsxz
Explanation: The common characters of s1
and s2 are: a,c. The uncommon characters
of s1 and s2 are b,s,x and z. Thus the
modified string with uncommon characters
concatenated is bsxz.
Your Task:
The task is to complete the function concatenatedString() which removes the common characters, concatenates, and returns the string. If all characters are removed then return -1.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Number of distinct characters).
Note: N = |Length of Strings|

Constraints: 
1 <= |Length of Strings| <= 104




  
// Can be done using hashmap also
//class Solution
// {
//     //Function to remove common characters and concatenate two strings.
//     public static String concatenatedString(String s1,String s2)
//     {
//         // Your code here
//       String str = s1+s2;
//         String ans = "";
        
//         for(int i=0;i<str.length();i++){
//             String a = "" + str.charAt(i);;
//             if(s1.contains(a) && s2.contains(a)){
                
//             }
//             else{
//                 ans = ans + a;
//             }
//         }
        
//         if(ans.length() == 0){
//             return "-1";
//         }
        
//         return ans;
//     }
// }




//  class Solution
// {
//     //Function to remove common characters and concatenate two strings.
//     public static String concatenatedString(String s1,String s2)
//     {
//         String str=s1+s2;
//         String ans="";
//         HashMap<Character, Integer> h=new HashMap<>();
        
//         for(char x:str.toCharArray()){
//             h.put(x,h.getOrDefault(x,0)+1);
//         }
        
//         for(int i=0;i<str.length();i++){
//             if(h.get(str.charAt(i))==1)
//             ans+=str.charAt(i);
            
//         }
        
        
//             return "-1";
         
        
        
        
        
        
        
//     }
    
// }





class Solution
{
    //Function to remove common characters and concatenate two strings.
    public static String concatenatedString(String s1,String s2)
    {
        // Your code here
        String s = s1.concat(s2);
        
        for(int i = 0;i<s2.length();i++){
            char c = s2.charAt(i);
            if(s1.contains(String.valueOf(c))){
                s = s.replace(c,'1');
            }
        }
        
        String S = "";
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)!='1'){
                S = S + s.charAt(i);
            }
        }
        if(S=="")return "-1";
        return S;
    }
}
