package DataStructure.Trees;

import java.util.LinkedList;

/**
 * Created by shubhamgoyal on 9/4/16.
 */
public class LevelOrderTraversal
{
    /*

 class Node
    int data;
    Node left;
    Node right;
*/
    void LevelOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        LinkedList<Node> myQueue = new LinkedList<>();
        myQueue.add(root);
        while(!myQueue.isEmpty())
        {
            int size = myQueue.size();
            for(int i = 0; i < size; i++)
            {
                Node temp = myQueue.remove();
                if(temp.left != null)
                {
                    myQueue.add(temp.left);
                }
                if(temp.right != null)
                {
                    myQueue.add(temp.right);
                }
                System.out.print(temp.data + " ");
            }
        }


    }

}
