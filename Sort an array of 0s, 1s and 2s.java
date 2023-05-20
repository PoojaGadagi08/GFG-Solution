

Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.


Example 1:

Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated 
into ascending order.
  
  
  class Solution
{
    public static void sort012(int a[], int arr_size)
    {
        int lo = 0;
        int hi = arr_size - 1;
        int mid = 0, temp = 0;
        // Iterate till all the elements
        // are sorted
        while (mid <= hi) {
            switch (a[mid]) {
                // If the element is 0
            case 0: {
                temp = a[lo];
                a[lo] = a[mid];
                a[mid] = temp;
                lo++;
                mid++;
                break;
            }
                // If the element is 1
            case 1:
                mid++;
                break;
                // If the element is 2
            case 2: {
                temp = a[mid];
                a[mid] = a[hi];
                a[hi] = temp;
                hi--;
                break;
            }
            }
        }
    }
}
