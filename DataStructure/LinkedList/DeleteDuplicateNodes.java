package DataStructure.LinkedList;

/**
 * Created by shubhamgoyal on 9/4/16.
 */
public class DeleteDuplicateNodes
{
    /*
Node is defined as
  class Node {
     int data;
     Node next;
  }
*/

    Node RemoveDuplicates(Node head) {
        // This is a "method-only" submission.
        // You only need to complete this method.
        if(head == null)
        {
            return head;
        }

        Node temp = head.next;
        Node previous = head;
        while(temp != null)
        {
            if(temp.data == previous.data)
            {
                previous.next = temp.next;
            }
            else
            {
                previous = temp;
            }
            temp = temp.next;
        }

        return head;
    }

}
