Find the focal length of the spherical mirror with the given radius-of-curvature R.
NOTE

The focal length of the 'convex' mirror floor(-R/2) and that of the 'concave' mirror is floor(R/2).

Example 1:

Input: type = "concave", R = 5.4
Output: 2
Explanation: Focal length of concave mirror = floor(R/2) = floor(5.4/2) = floor(2.7) = 2.
  
  
  

//User function Template for Java

class Solution
{
    public int findFocalLength(float R, String type){
        int focal=0;
        String cave= "concave";
        String vex= "convex";
        if(type.equals(cave)){
            float temp =(int) R/2;
            focal = (int) Math.floor(temp);
        }
        else if(type.equals(vex)){
            float temp= -R/2;
            focal = (int) Math.floor(temp);
            
        }
        return focal;
    }
}
