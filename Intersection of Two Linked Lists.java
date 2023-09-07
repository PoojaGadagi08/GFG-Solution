Given two linked lists, the task is to complete the function findIntersection(), that returns the intersection of two linked lists. Each of the two linked list contains distinct node values.

Example 1:

Input:
LinkedList1: 9->6->4->2->3->8
LinkedList2: 1->2->8->6
Output: 6 2 8
Your Task:
You task is to complete the function findIntersection() which takes the heads of the 2 input linked lists as parameter and returns the head of intersection list. Returned list will be automatically printed by driver code.
Note: The order of nodes in this list should be same as the order in which those particular nodes appear in input list 1.

Constraints:
1 <= n,m <= 104

Expected time complexity: O(m+n)
Expected auxiliary space: O(m+n)




  class Solution
{
    public static Node findIntersection(Node head1, Node head2)
    {
        // add your code here
        // return the head of intersection list
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> l = new ArrayList<>();
        while(head2 != null){
            set.add(head2.data);
            head2=head2.next;
        }
        Node p=head1;
        while(p != null){
            if(set.contains(p.data)){
                l.add(p.data);
            }
            p=p.next;
        }
        p=head1;
        for(int i=0;i<l.size();i++){
            p.data=l.get(i);
            if(i == l.size()-1){
                break;
            }
            p=p.next;
        }
        p.next = null;
        return head1;
    }
}

