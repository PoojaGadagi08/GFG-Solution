Given a doubly linked list and a position. The task is to delete a node from given position in a doubly linked list.

Example 1:

Input:
LinkedList = 1 <--> 3 <--> 4 
x = 3
Output: 1 3  
Explanation: After deleting the node at
position 3 (position starts from 1),
the linked list will be now as 1->3.
Example 2:

Input:
LinkedList = 1 <--> 5 <--> 2 <--> 9  
x = 1
Output: 5 2 9
Your Task:
The task is to complete the function deleteNode() which should delete the node at given position and return the head of the linkedlist.

Expected Time Complexity : O(N)
Expected Auxilliary Space : O(1)

Constraints:
2 <= size of the linked list <= 1000
1 <= x <= N





  
//User function Template for Java

/* Structure of linkedlist node
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int d)
	{
		data = d;
		next = prev = null;
	}
}
*/
class Solution
{
    // function returns the head of the linkedlist
    Node deleteNode(Node head,int x)
    {
        if(x == 1){  // remove head of the linkedlist
            
            head = head.next;
            head.prev = null;
            
        }else{
        int index = 1;
        Node temp = head;
        Node prev = null;
        while (temp!=null){
            if(index == x){
                
                prev = temp.prev;
                if(temp.next == null){   //last node
                    
                    prev.next = null;
                    temp.prev = null;
                    temp = null;
                    break;
                }
                
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
 
                    /*
                    temp.next
                    temp.prev
                    temp.next.prev
                    temp.prev.next
                    */
                break;
            }
            temp = temp.next;
            index++;
        }
        }
        return head;
    }
}
