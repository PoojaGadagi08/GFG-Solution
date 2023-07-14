Given an array A[] of size N and a positive integer K, find the first negative integer for each and every window(contiguous subarray) of size K.

 

Example 1:

Input : 
N = 5
A[] = {-8, 2, 3, -6, 10}
K = 2
Output : 
-8 0 -6 -6
Explanation :
First negative integer for each window of size k
{-8, 2} = -8
{2, 3} = 0 (does not contain a negative integer)
{3, -6} = -6
{-6, 10} = -6
 
Example 2:
Input : 
N = 8
A[] = {12, -1, -7, 8, -15, 30, 16, 28}
K = 3
Output :
-1 -1 -7 -15 -15 0 
 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function printFirstNegativeInteger() which takes the array A[], its size N and an integer K as inputs and returns the first negative number in every window of size K starting from the first till the end. If a window does not contain a negative integer , then return 0 for that window.


Expected Time Complexity: O(N)




  
//User function Template for Java


class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        long[] ans=new long[N-K+1];
        int index=0;
        Deque<Integer> d=new LinkedList<>();
        // first do operatiosns on first window
        for(int i=0;i<K;i++){
            if(A[i]<0){
                d.add(i);
            }
            
        }
        
        // remaining elements krdo
        for(int i=K;i<N;i++){
            if(d.size()==0){
                ans[index]=0;
            }
            else{
                ans[index]=A[d.peek()];
            }
            // out of window element remove krna hai
            while(d.size()>0 && i-d.peek()>=K){
                d.removeFirst();
            }
            // check for current;
            if(A[i]<0){
                d.add(i);
            }
            index++;
        }
        
        // check for last window
        if(d.size()==0){
                ans[index]=0;
            }
            else{
                ans[index]=A[d.peek()];
            }
            return ans;
    }
}
