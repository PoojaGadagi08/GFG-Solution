Geek is very fond of patterns. Once, his teacher gave him a square pattern to solve. He gave Geek an integer n and asked him to build a pattern.

Help Geek to build a star pattern.

 

Example 1:

Input: 5

Output:
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *


class Solution:
    def printSquare(self, N):
        # Code here
        for i in range(0,N):
            for j in range(0,N):
                print("*",end=" ")
            print()
