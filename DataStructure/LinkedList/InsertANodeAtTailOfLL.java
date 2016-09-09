package DataStructure.LinkedList;

/**
 * Created by shubhamgoyal on 9/4/16.
 */
public class InsertANodeAtTailOfLL
{
    /*
  Insert Node at the end of a linked list
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/
    Node Insert(Node head,int data) {
        // This is a "method-only" submission.
        // You only need to complete this method.

        if(head == null)
        {
            head = new Node();
            head.data = data;
            head.next = null;
        }
        else
        {
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = null;
            Node prev = head;
            while(prev.next != null)
            {
                prev = prev.next;
            }
            prev.next = newNode;
        }

        return head;
    }
}
