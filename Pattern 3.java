Geek is very fond of patterns. Once, his teacher gave him a  pattern to solve. He gave Geek an integer n and asked him to build a pattern.

Help Geek to build a pattern.

 

Example 1:

Input: 5

Output:
1
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5



class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=0;i<n;i++){
            int a=1;
            for(int j=0;j<=i;j++){
                System.out.print(a+" ");
               a+=1;
            }
             
             System.out.println();
        }
    }
}
