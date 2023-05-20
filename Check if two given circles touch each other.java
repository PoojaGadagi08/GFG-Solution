Given two circles C1 of radius R1 and C2 of radius R2,centered at (X1,Y1) and (X2,Y2) respectively.
  Find out whether they touch(at one or more than one points).

Example 1:

Input:
X1=3
Y1=4
R1=5
X2=14
Y2=18
R2=8
Output:
0
Explanation:
The circles centred at (3,4) and (14,18)
and having radii 5 and 8 respectively
do not touch each other.





// User function template for Java
class Solution {
    int circleTouch(int X1, int Y1, int R1, int X2, int Y2, int R2) {
        double t=Math.pow((X2-X1),2)+Math.pow((Y2-Y1),2);
        long g=(long)Math.sqrt(t);
        long r=R1+R2;
        if(r>g)
        {
            return 1;
        }
        else
        return 0;
    }
}
