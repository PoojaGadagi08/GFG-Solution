Given a binary tree and a number K, the task is to find sum of tree nodes at level K. The Binary Tree is given in string form S: (node-value(left-subtree)(right-subtree)).

 

Example 1:

Input:
K = 2
S = "(0(5(6()())(4()(9()())))(7(1()())(3()())))"
Output:
14
Explanation:
The Tree from the above String will be formed as:
                             0
                           /   \
                          5      7
                        /  \    /  \
                       6    4  1    3
                             \
                              9  
Sum of nodes at the 2nd level is 6+4+1+3 = 14.
Example 1:

Input:
K = 1
S = "(4(8()9())"
Output:
17
Explanation:
The Tree from the above String will be formed as:
                             4
                           /   \
                          8     9
Sum of nodes at the 1st level is 8+9 = 17.
 

Your Task:
You don't need to read input or print anything. Your task is to complete the function kLevelSum() which takes an Integer K and a String S as input and returns the sum of all the node values at Kth level of the tree.

 

Expected Time Complexity: O(|S|)
Expected Auxiliary Space: O(1)

 

Constraints:
5 <= |S| <= 105
0 <= K <= 15



  class Solution {
    static int kLevelSum(int K, String S) {
        // code here
          int level = -1 ;
       int sum = 0 ;
       for( int i = 0 ; i< S.length(); i++)
       {
           if(S.charAt(i)=='(')
           {
               level++ ;
           }
           else if(S.charAt(i) == ')')
           {
               level-- ;
           }
           else 
           {
          
            if(level==K){
                String st = "";
                st=st+S.charAt(i);
                while(S.charAt(i+1)!= '('){
                    i++;
                    st=st+S.charAt(i);
                }
                sum=sum + Integer.parseInt(st);
            }
           }
       }
       
       return sum ;
    }
};
