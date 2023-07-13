Given an array arr of distinct elements of size N, the task is to rearrange the elements of the array in a zig-zag fashion so that the converted array should be in the below form: 

arr[0] < arr[1]  > arr[2] < arr[3] > arr[4] < . . . . arr[n-2] < arr[n-1] > arr[n]. 

NOTE: If your transformation is correct, the output will be 1 else the output will be 0. 

Example 1:

Input:
N = 7
Arr[] = {4, 3, 7, 8, 6, 2, 1}
Output: 3 7 4 8 2 6 1
Explanation: 3 < 7 > 4 < 8 > 2 < 6 > 1
Example 2:

Input:
N = 4
Arr[] = {1, 4, 3, 2}
Output: 1 4 2 3
Explanation: 1 < 4 > 2 < 3
Your Task:
You don't need to read input or print anything. Your task is to complete the function zigZag() which takes the array of integers arr and n as parameters and returns void. You need to modify the array itself.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)



  
//User function Template for Java
class Solution{
    void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public void zigZag(int a[], int n){
        for(int i = 0; i < (n-1)/2; i++){
            if(a[2*i + 1]>a[2*i] && a[2*i + 1]>a[2*i + 2]){
                continue;
            }
            else if(a[2*i + 1] > a[2*i]){
                if(a[2*i + 1] < a[2*i + 2]){
                    swap(a,2*i + 1,2*i + 2);
                }
            }
            else{
                swap(a,2*i+1,2*i);
                if(a[2*i + 1] < a[2*i + 2]){
                    swap(a,2*i + 1,2*i + 2);
                }
            }
        }
        if(n%2==0 && a[n-1] < a[n-2]){
            swap(a,n-1,n-2);
        }
    }
}
