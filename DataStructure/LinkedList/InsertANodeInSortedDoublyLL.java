package DataStructure.LinkedList;

/**
 * Created by shubhamgoyal on 9/4/16.
 */
public class InsertANodeInSortedDoublyLL
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

    Node SortedInsert(Node head,int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.prev = null;
        newNode.next = null;
        if(head == null)
        {
            head = newNode;
        }
        Node temp = head;
        while(temp.next != null && temp.next.data < data)
        {

            temp = temp.next;
        }
        if(temp.next == null)
        {
            temp.next = newNode;
            newNode.prev = temp;
            newNode.next = null;
            return head;
        }

        temp.next.prev = newNode;
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next = newNode;

        return head;
    }

}
