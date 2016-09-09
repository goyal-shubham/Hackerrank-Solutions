package DataStructure.LinkedList;

/**
 * Created by shubhamgoyal on 9/4/16.
 */
public class MergeTwoSortedLL
{
    /*
  Merge two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/

    Node MergeLists(Node headA, Node headB) {
        // This is a "method-only" submission.
        // You only need to complete this method
        if(headA == null)
        {
            return headB;
        }

        if(headB == null)
        {
            return headA;
        }

        Node head = new Node();
        Node temp = head;
        while(headA != null && headB != null)
        {
            if(headA.data <= headB.data)
            {
                head.next = headA;
                headA = headA.next;
            }
            else
            {
                head.next = headB;
                headB = headB.next;
            }
            head = head.next;
        }

        if(headA == null)
        {
            head.next = headB;
        }
        if(headB == null)
        {
            head.next = headA;
        }
        return temp.next;
    }

}
