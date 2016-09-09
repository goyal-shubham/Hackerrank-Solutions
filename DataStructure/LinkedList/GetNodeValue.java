package DataStructure.LinkedList;

/**
 * Created by shubhamgoyal on 9/4/16.
 */
public class GetNodeValue
{
    /*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/

    int GetNode(Node head,int n) {
        // This is a "method-only" submission.
        // You only need to complete this method.
        Node temp = head;
        for(int i = 0; i < n; i++)
        {
            temp = temp.next;
        }

        while(temp.next != null )
        {
            head = head.next;
            temp = temp.next;
        }

        return head.data;
    }

}
