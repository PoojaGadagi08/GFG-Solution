Given two decimal numbers represented by two linked lists of size N and M respectively. The task is to return a linked list that represents the sum of these two numbers.

For example, the number 190 will be represented by the linked list, 1->9->0->null, similarly 25 by 2->5->null. Sum of these two numbers is 190 + 25 = 215, which will be represented by 2->1->5->null. You are required to return the head of the linked list 2->1->5->null.

Example 1:

Input:
N = 2
valueN[] = {4,5}
M = 3
valueM[] = {3,4,5}
Output: 3 9 0  
Explanation: For the given two linked
list (4 5) and (3 4 5), after adding
the two linked list resultant linked
list will be (3 9 0).
Example 2:

Input:
N = 2
valueN[] = {6,3}
M = 1
valueM[] = {7}
Output: 7 0
Explanation: For the given two linked
list (6 3) and (7), after adding the
two linked list resultant linked list
will be (7 0).
Your Task:
The task is to complete the function addTwoLists() which has node reference of both the linked lists and returns the head of the sum list.   

Expected Time Complexity: O(N+M)
Expected Auxiliary Space: O(Max(N,M)) for the resultant list.

Constraints:
1 <= N, M <= 5000






class Solution{
    //Function to add two numbers represented by linked list.
    static Node reverse(Node head)
    {
        Node prev=null;
        Node curr=head;
        while(curr!=null)
        {
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        Node a=reverse(first);
        Node b=reverse(second);
        Node s=new Node(0);
        Node h=s;
        int c=0;
        while(a!=null && b!=null)
        {
            int d=a.data+b.data+c;
            Node n=new Node(d%10);
            c=d/10;
            s.next=n;
            s=s.next;
            a=a.next;
            b=b.next;
        }
        while(a!=null)
        {
            int d=a.data+c;
             Node n=new Node(d%10);
            c=d/10;
            s.next=n;
            s=s.next;
            a=a.next;
        }
        while(b!=null)
        {
            int d=b.data+c;
             Node n=new Node(d%10);
            c=d/10;
            s.next=n;
            s=s.next;
            b=b.next;
        }
        if(c!=0)
        {
            s.next=new Node(c);
        }
        Node head=reverse(h.next);
        return head;
    }
}
