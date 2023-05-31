Given head, the head of a singly linked list, find if the linked list is circular or not. A linked list is called circular 
if it not NULL terminated and all nodes are connected in the form of a cycle. An empty linked list is considered as circular.

Note: The linked list does not contains any inner loop.

Example 1:

Input:
LinkedList: 1->2->3->4->5
(the first and last node is connected,
i.e. 5 --> 1)
Output: 1
  
  
  /* Structure of LinkedList
class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
*/
class GfG
{
    boolean isCircular(Node head)
    {
        // An empty linked list is circular
        if (head == null)
            return true;
	// Your code here
 Node node = head.next;
  
        // This loop would stop in both cases (1) If
        // Circular (2) Not circular
        while (node != null && node != head)
            node = node.next;
  
        // If loop stopped because of circular
        // condition
        return (node == head);
    }
}
