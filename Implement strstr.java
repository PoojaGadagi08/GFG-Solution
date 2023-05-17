
// Your task is to implement the function strstr. 
// The function takes two strings as arguments (s,x) and  locates the occurrence of the string x in the string s. 
// The function returns and integer denoting the first occurrence of the string x in s (0 based indexing).

// Note: You are not allowed to use inbuilt function.
// Expected Time Complexity: O(|s|*|x|)
// Expected Auxiliary Space: O(1)

class GfG
{
    //Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x)
    {
       // Your code here
       int a=s.indexOf(x);
       
       if(a==-1)
       return -1;
       
       return a;
    }
}
