Given a single linked list of size M, your task is to complete the function sumOfLastN_Nodes(), which should return the sum of last N nodes of the linked list.

Input:
The function takes two arguments as input, the reference pointer to the head of the linked list and the an integer N.
There will be T test cases and for each test case the function will be called seperately.

Output:
For each test case output the sum of last N nodes of the linked list.

Constraints:
1<=T<=100
1<=N<=M<=1000

Example:
Input:
2
6 3
5 9 6 3 4 10
2 2
1 2

Output:
17
3

Explanation:
Testcase 1: Sum of last three nodes in the linked list is 3 + 4 + 10 = 17.
 


  
/*
Node class is as follows:

class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    
    //Return the sum of last k nodes
    public int sum(Node head, int k){
        //write code here
        int size = 0;
          
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
          
        temp = head;
        int count = size - k;
        while (temp != null && count > 0) {
            temp = temp.next;
            count--;
        }
            
        int sum = 0;
        while (temp != null) {
            sum += temp.data;
            temp = temp.next;
        }
        return sum;
    }
}

