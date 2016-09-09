package DataStructure.LinkedList;

/**
 * Created by shubhamgoyal on 9/4/16.
 */
public class FindMergePointOfTwoList
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
    int FindMergeNode(Node headA, Node headB) {
        // Complete this function
        // Do not write the main method.
        Node a = headA;
        Node b = headB;
        while(a != b)
        {
            a = a.next;
            b = b.next;
            if(a == null)
            {
                a = headB;
            }
            if(b == null)
            {
                b = headA;
            }
            if( a == b)
            {
                return a.data;
            }
        }

        return 0;
    }

}
