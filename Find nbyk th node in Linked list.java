Given a singly linked list and a number k. Write a function to find the (N/k)th element, where N is the number of elements in the list. We need to consider ceil value in case of decimals.

Input:
The first line of input contains an integer T denoting the number of test cases. The first line of each test case consists of an integer N. The second line consists of N spaced integers.The last line consists of an integer k.

Output:
Print the data value of (N/k)th node in the Linked List.

User Task:
The task is to complete the function fractional_node() which should find the n/kth node in the linked list and return its data value.

Constraints: 
1 <= T <= 100
1 <= N <= 100
K > 0

Example:
Input:
2
6
1 2 3 4 5 6
2
5
2 7 9 3 5
3

Output:
3
7

Explanation:
Testcase 1: 6/2th element is the 3rd(1-based indexing) element which is 3.

Testcase 2: 5/3rd element is the 2nd element as mentioned in question that we need to consider ceil value in case of decimals. So 2nd element is 7.


/*
class Node
{
    int data;
    Node next;
    
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class GfG
{
    public static int nknode(Node head, int k)
    {
       // add your code here
        Node curr=head;
        if(head==null)
        return 0;
        int n=0;
        while(curr!=null){
            curr=curr.next;
            n++;
        }
        if(n < k)
        return 0;
        if(n==1 && k==1)
        return head.data;
       
        int n1=0;
        if(n%2==0){
              n1 = (int) Math.ceil((double) n / k);
            //System.out.println("n 1 value is "+n1);
           
          curr=head;
          for(int i=0;i<n1-1;i++)
          curr=curr.next;
          return curr.data;
        }
        
        
             n1 = (int) Math.ceil((double) n / k);
           // n1=n/k+1;
              curr=head;
          for(int i=0;i<n1-1;i++)
          curr=curr.next;
          return curr.data;
     
        
    }
}
