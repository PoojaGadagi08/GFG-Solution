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



class Solution:
    def printTriangle(self, N):
        for i in range(0,N):
            a=1
            for j in range(0, i+1):
                print(a,end=" ")
                a=a+1
            print()    
                
