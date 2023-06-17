Print GFG n times without the loop.

Example:

Input:
5
Output:
GFG GFG GFG GFG GFG
class Solution {

    void printGfg(int n) {
     int i=1;
     if(i>n) return ;
     
     System.out.print("GFG ");
     
     printGfg(n-1);
     i++;
    }
}
