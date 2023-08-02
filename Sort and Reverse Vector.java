You are given a vector V of size n. You need to sort it and reverse it.

Example 1:

Input:
n = 5
V = 1 2 3 4 5
Output: 
1 2 3 4 5
5 4 3 2 1
Your Task:
Since this is a function problem, you don't need to take any input. Just complete the provided functions sortVector() and reverseVector(). Return the vector after performing suitable operations.

Constraints:
1 <= n <= 107

  
//User function Template for C++

vector<int> sortVector(vector<int>v)
{
   //Your code here. Use library function
    sort(v.begin(),v.end());
    return v;
}
vector<int> reverseVector(vector<int>v)
{
     //Your code here. Use library function
     reverse(v.begin(),v.end());
    return v;
}
