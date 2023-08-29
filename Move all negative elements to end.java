Given an unsorted array arr[] of size N having both negative and positive integers. The task is place all negative element at the end of array without changing the order of positive element and negative element.

 

Example 1:

Input : 
N = 8
arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
Output : 
1  3  2  11  6  -1  -7  -5

Example 2:

Input : 
N=8
arr[] = {-5, 7, -3, -4, 9, 10, -1, 11}
Output :
7  9  10  11  -5  -3  -4  -1
 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function segregateElements() which takes the array arr[] and its size N as inputs and store the answer in the array arr[] itself.

 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)



  //User function Template for Java

class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        ArrayList<Integer> list1= new ArrayList <>();
        ArrayList<Integer> list2= new ArrayList <>();
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                list1.add(arr[i]);
            }
            else{
                list2.add(arr[i]);
            }
        }
        for(int i=0;i<list1.size();i++){
            arr[i]=list1.get(i);
        }
        for(int i=0;i<list2.size();i++){
            arr[list1.size()+i]=list2.get(i);
        }
    }
}
