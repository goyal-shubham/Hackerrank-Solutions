package DataStructure.LinkedList;

/**
 * Created by shubhamgoyal on 9/4/16.
 */
public class InsertANodeAtPositionOfLL
{
    /*
  Insert Node at a given position in a linked list
  head can be NULL
  First element in the linked list is at position 0
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/


    Node InsertNth(Node head, int data, int position) {
        // This is a "method-only" submission.
        // You only need to complete this method.
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        if(head == null)
        {
            head = newNode ;
        }

        else if(position == 0)
        {
            newNode.next = head;
            head = newNode;
        }
        else
        {
            Node temp = head;
            while(temp.next != null && position-- > 1 )
            {
                temp = temp.next;
            }

            newNode.next = temp.next;
            temp.next = newNode;
        }

        return head;
    }

}
