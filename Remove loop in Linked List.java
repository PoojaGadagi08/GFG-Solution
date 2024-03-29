class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        
        if(head == null || head.next == null)
        {
            return;
        }
        
        Node slow = head;
        Node fast = head;
        
        boolean isLoopFound = false;
        
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast)
            {
                isLoopFound = true;
                break;
            }
        }
        
        // If loop found 
        // case1 -> when both nodes are meeting somewhere else other than head !
        // case2 -> when both nodes are meeting at head !
        if(isLoopFound) 
        {
            slow = head;
            
            if(slow != fast)
            {
                // here slow and fast nodes are not meeting at head !
                while(slow.next != fast.next) 
                {
                    slow = slow.next;
                    fast = fast.next;
                }
                
                // Break the loop
                fast.next = null;
            }
            else
            {
                // when last node is connected to first node, then slow and fast nodes are meeting at head.
                while(fast.next != slow)
                {
                    fast = fast.next;
                }
                
                // Break the loop
                fast.next = null;
            }

        }
        
       
    }
}
