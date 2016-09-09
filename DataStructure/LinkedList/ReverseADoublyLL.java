package DataStructure.LinkedList;

/**
 * Created by shubhamgoyal on 9/4/16.
 */
public class ReverseADoublyLL
{
    /*
  Insert Node at the end of a linked list
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

    Node Reverse(Node head) {

        Node current = head;
        while(current != null)
        {
            Node temp = current.next;
            current.next = current.prev;
            current.prev = temp;
            current = current.prev;
        }

        current = head;
        while(current != null && current.prev != null)
        {
            current = current.prev;
        }

        return current;

    }

}
