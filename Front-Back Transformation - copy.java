Given a string S, consisting only of english alphabets, replace all the alphabets with the alphabets occuring at the same
position when counted in reverse order of alphabets. For example, 'a' would be replaced by 'z', 'b' by 'y', 'c' by 'x' and so on. 
  Any capital letters would be replaced by capital letters only.

 

Example 1:

Input: S = "Hello"
Output: Svool
Explanation: 'H' is the 8th letter from the
beginning of alphabets, which is replaced by
'S' which comes at 8th position in reverse order
of alphabets. Similarly, all other letters are 
replaced by their respective upper or lower case 
letters accordingly.
  
  
//User function Template for Java
class Solution 
{ 
    String convert(String s) 
    
    { 
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                int index ='Z'-ch+'A';
                sb.append((char)index);
            }else{
                 int index ='z'-ch+'a';
                sb.append((char)index);
            }
        }
        return sb.toString();
    }
} 
