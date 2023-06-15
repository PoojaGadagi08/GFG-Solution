Geek is very fond of patterns. Once, his teacher gave him a  pattern to solve. He gave Geek an integer n and asked him to build a pattern.

Help Geek to build a pattern.

 

Example 1:

Input: 5

Output:
1
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5


class Solution:
    def printTriangle(self, N):
        a=1
        for i in range(0,N):
            
            for j in range(0, i+1):
                print(a,end=" ")
            a=a+1
            print()    
