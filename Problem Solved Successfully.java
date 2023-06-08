Given a linked list of size N and a key. The task is to insert the key in the middle of the linked list.

Example 1:

Input:
LinkedList = 1->2->4
key = 3
Output: 1 2 3 4
Explanation: The new element is inserted
after the current middle element in the
linked list.



/*
Structure of node class is:
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    
    public Node insertInMid(Node head, int data){
        //Insert code here, return the head of modified linked list
        if(head==null)
        head=new Node(data);
        else{
            Node newNode=new Node(data);
            
            Node temp=head;
            int c=0;  //length of LL
            while(temp!=null){
            c++;
            temp=temp.next;
            }
        
           int count=(c%2==0)? (c/2):(c+1)/2;
           
            temp = head;
  
            // 'ptr' points to the node after which 
            // the new node is to be inserted
            while (count-- > 1)
                temp = temp.next;
  
            // insert the 'newNode' and adjust 
            // the required links
            newNode.next = temp.next;
            temp.next = newNode;
        }
        return head;
    }
}
