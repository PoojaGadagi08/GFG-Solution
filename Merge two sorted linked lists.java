Given two sorted linked lists consisting of N and M nodes respectively. The task is to merge both of the list (in-place) and return head of the merged list.
 

Example 1:

Input:
N = 4, M = 3 
valueN[] = {5,10,15,40}
valueM[] = {2,3,20}
Output: 2 3 5 10 15 20 40
Explanation: After merging the two linked
lists, we have merged list as 2, 3, 5,
10, 15, 20, 40.
Example 2:

Input:
N = 2, M = 2
valueN[] = {1,1}
valueM[] = {2,4}
Output:1 1 2 4
Explanation: After merging the given two
linked list , we have 1, 1, 2, 4 as
output.
Your Task:
The task is to complete the function sortedMerge() which takes references to the heads of two linked lists as the arguments and returns the head of merged linked list.

Expected Time Complexity : O(n+m)
Expected Auxilliary Space : O(1)

Constraints:
1 <= N, M <= 104
0 <= Node's data <= 105



  
/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node list1, Node list2) {
     // This is a "method-only" submission. 
     // You only need to complete this method
     
        if(list1!=null && list2!=null){
        if(list1.data<list2.data){
            list1.next=sortedMerge(list1.next,list2);
            return list1;
            }
            else{
                list2.next=sortedMerge(list1,list2.next);
                return list2;
        }
        }
        if(list1==null)
            return list2;
        return list1;
   } 
}
