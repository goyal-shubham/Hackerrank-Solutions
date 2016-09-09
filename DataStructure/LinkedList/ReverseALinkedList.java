package DataStructure.LinkedList;

/**
 * Created by shubhamgoyal on 9/4/16.
 */
public class ReverseALinkedList
{
    /*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission.
    // You only need to complete this method.
    Node Reverse(Node head) {
        if(head == null)
        {
            return null;
        }

        Node previous = null;
        Node current = head;

        while(current != null)
        {
            Node temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
    }

}
