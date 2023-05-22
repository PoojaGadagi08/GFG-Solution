Given an array A of N elements. Find the majority element in the array.
  A majority element in an array A of size N is an element that appears more than N/2 times in the array.
 

Example 1:

Input:
N = 3 
A[] = {1,2,3} 
Output:
-1
Explanation:
Since, each element in 
{1,2,3} appears only once so there 
is no majority element.
  
  
  
//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    // {
    //     // your code here
    //     HashMap<Integer, Integer> m=new HashMap<>();
    //     for(int i=0;i<n;i++){
    //         if(m.containsKey(a[i])){
    //         int c=m.get(a[i])+1;
    //             if(c>a.length/2){
    //             return a[i];
    //             }
            
    //         else 
    //         m.put(a[i],c);
    //     }
    //     else 
    //     m.put(a[i],1);
    //     }
    //     return -1;
     {
        /* Find the candidate for Majority*/
        int cand = findCandidate(a, size);
 
        /* Print the candidate if it is Majority*/
        if (isMajority(a, size, cand))
           return cand;
       return -1;
    }
 
    /* Function to find the candidate for Majority */
    public static  int findCandidate(int a[], int size)
    {
        int maj_index = 0, count = 1;
        int i;
        for (i = 1; i < size; i++) {
            if (a[maj_index] == a[i])
                count++;
            else
                count--;
            if (count == 0) {
                maj_index = i;
                count = 1;
            }
        }
        return a[maj_index];
    }
 
    /* Function to check if the candidate occurs more
       than n/2 times */
   public static  boolean isMajority(int a[], int size, int cand)
    {
        int i, count = 0;
        for (i = 0; i < size; i++) {
            if (a[i] == cand)
                count++;
        }
        if (count > size / 2)
            return true;
        else
            return false;
    
 
    
    
    }
}
  
  
