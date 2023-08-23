Given a sorted and rotated array A of N distinct elements which is rotated at some point, and given an element key. The task is to find the index of the given element key in the array A. The whole array A is given as the range to search.

Example 1:

Input:
N = 9
A[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}
key = 10
l = 0 , h = 8
Output:
5
Explanation: 10 is found at index 5.
Example 2:

Input:
N = 4
A[] = {3, 5, 1, 2}
key = 6
l = 0 , h = 3
Output:
-1
Explanation: There is no element that has value 6.
Your Task:
Complete the function search() which takes an array arr[] and start, end index of the array and the K as input parameters, and returns the answer.

Can you solve it in expected time complexity?

Expected Time Complexity: O(log N).
Expected Auxiliary Space: O(1).



  
//User function Template for Java

class Solution
{
    int search(int a[], int l, int h, int key)
    {
        // l: The starting index
        // h: The ending index, you have to search the key in this range
        // Complete this function
        
        while(l<=h){
            int m=(l+h)/2;
            
            if(a[m]==key)
            return m;
            
            //left sorted
            if(a[l]<=a[m]){
                if(a[l]<=key && key<=a[m])
                h=m-1;
                else 
                l=m+1;
            }
            //right sorted
            else{
                if(a[m]<=key && key<=a[h])
                l=m+1;
                else 
                h=m-1;
            }
        }
        return -1;
    }
}