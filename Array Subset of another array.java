Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m. Task is to check whether a2[] is a subset of a1[] or not. Both the arrays can be sorted or unsorted. There can be duplicate elements.
 

Example 1:

Input:
a1[] = {11, 7, 1, 13, 21, 3, 7, 3}
a2[] = {11, 3, 7, 1, 7}
Output:
Yes
Explanation:
a2[] is a subset of a1[]

Example 2:

Input:
a1[] = {1, 2, 3, 4, 4, 5, 6}
a2[] = {1, 2, 4}
Output:
Yes
Explanation:
a2[] is a subset of a1[]

Example 3:

Input:
a1[] = {10, 5, 2, 23, 19}
a2[] = {19, 5, 3}
Output:
No
Explanation:
a2[] is not a subset of a1[]
 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function isSubset() which takes the array a1[], a2[], its size n and m as inputs and return "Yes" if arr2 is subset of arr1 else return "No" if arr2 is not subset of arr1.

 

Expected Time Complexity: O(max(n,m))
Expected Auxiliary Space: O(n)





  
//User function Template for Java


class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        HashMap<Long,Long> set=new HashMap<Long,Long>();  
        for(int i=0;i<n;i++){
          if(set.containsKey(a1[i])){
              set.replace(a1[i],set.get(a1[i])+1);
          }
          else{
              long a=1;
              set.put(a1[i],a);
          }
        }
        for(int i=0;i<m;i++){
            if(set.containsKey(a2[i])){
                if(set.get(a2[i])>1){
                    set.replace(a1[i],set.get(a1[i])-1);
                }
                else{
                set.remove(a2[i]);}
            }
            else{
                return "No";
            }
        }
        return "Yes";

        
    }
}
