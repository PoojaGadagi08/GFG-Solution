Given two strings A and B. Find the characters that are not common in the two strings. 

Note :- Return the string in sorted order.

Example 1:

Input:
A = geeksforgeeks
B = geeksquiz
Output: fioqruz
Explanation: 
The characters 'f', 'i', 'o', 'q', 'r', 'u','z' 
are either present in A or B, but not in both.
Example 2:

Input:
A = characters
B = alphabets
Output: bclpr
Explanation: The characters 'b','c','l','p','r' 
are either present in A or B, but not in both.

Your Task:  
You dont need to read input or print anything. Complete the function UncommonChars() which takes strings A and B as input parameters and returns a string that contains all the uncommon characters in sorted order. If no such character exists return "-1".


Expected Time Complexity: O(M+N) where M and N are the sizes of A and B respectively.
Expected Auxiliary Space: O(M+N)  


Constraints:
1<= M,N <= 104
String may contain duplicate characters.




  class Solution
{
    String UncommonChars(String A, String B)
    {
         int len1 = A.length();
        int len2 = B.length();
        char[] arr1 = new char[26];
        char[] arr2 = new char[26];
        char[] ch = new char[26];
         char[] ch1 = new char[26];
        for(int i = 0; i<len1;i++){
            char s1 = A.charAt(i);
              arr1[s1-97]=s1;
        }
          for(int i = 0; i<len2;i++){
            char s2 = B.charAt(i);
            arr2[s2-97]=s2;
        }
         for(int i = 0; i<26;i++){
             if(arr1[i]!=arr2[i])
                ch[i] = arr1[i];
            
             }
              for(int i = 0; i<26;i++){
             if(arr2[i]!=arr1[i])
                ch1[i] = arr2[i];
            
             }
            
               String s = new String(ch);
                  s = s.trim().replaceAll("\\s","");
               String s1 = new String(ch1);
                   s1 = s1.trim().replaceAll("\\s","");
                String s4 = new String();
               
                
                 s4 = s + s1;
                 char charArray[] = s4.toCharArray();
                 Arrays.sort(charArray);
      
               String s3 = new String(charArray);
                String t = "-1";
             if(s.equals(s1))
                  return t;
              else  
                 return  s3;
    
 
                
    }
}
