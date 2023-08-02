You are given a string S, convert it into a magical string.
A string can be made into a magical string if the alphabets are swapped in the given manner: a->z or z->a, b->y or y->b, and so on.  
 

Note: All the alphabets in the string are in lowercase.

 

Example 1:

Input:
S = varun
Output:
ezifm
Explanation:
Magical string of "varun" 
will be "ezifm" 
since v->e , a->z , 
r->i , u->f and n->m.
 

Example 2:

Input:
S = akshay
Output:
zphszb
Explanation:
Magical string of "akshay" 
will be "zphszb" 
since a->z , k->p , s->h , 
h->s , a->z and y->b.
 

Your Task:

You don't need to read input or print anything. Your task is to complete the function magicalString() which takes the string S and returns the magical string.

 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


  
//User function Template for Java
class Solution{
    static String magicalString(String S){
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0;i<S.length();i++){
            char ch = S.charAt(i);
        
            char p = (char)('a'+('z'-ch));
            sb.append(p);
        }
        return sb.toString();
    }
}
