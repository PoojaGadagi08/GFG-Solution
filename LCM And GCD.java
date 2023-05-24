
class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long arr[]=new Long[2];
        arr[0]=lcm(A,B);
        arr[1]=gcd(A,B);
        return arr;
    }
     static long gcd(long a,long b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
     
    // method to return LCM of two numbers
    static long lcm(long a,long b)
    {
        return (a / gcd(a, b)) * b;
    }
};
