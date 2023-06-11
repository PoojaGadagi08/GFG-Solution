Given a vector of N positive integers and an integer X. The task is to find the frequency of X in vector.

 

Example 1:

Input:
N = 5
vector = {1, 1, 1, 1, 1}
X = 1
Output: 
5
Explanation: Frequency of 1 is 5.
  
  
  
//User function Template for Java

class Solution{
    int findFrequency(int a[], int x){
        // HashMap<Integer,Integer> h=new HashMap<>();
        // int c=0;
        // for(int i=0;i<A.length;i++){
        //     h.put(h.getOrDefault(0,A[i]),1);
            
        //     if(h.containsKey(A[i]))
        //     c=h.get(A[i]);
        //     else
        //     h.put(A[i],1);
        // }
        // return c;
        
        
        
        int count = 0;
        for (int i=0; i < a.length; i++)
        if (a[i] == x)
            count++;
        return count;
    }
}
