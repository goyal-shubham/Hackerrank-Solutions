package DataStructure.Trees;

/**
 * Created by shubhamgoyal on 9/4/16.
 */
public class BinarySearchTreeInsertion
{
     /* Node is defined as :
 class Node
    int data;
    Node left;
    Node right;

    */

    static Node Insert(Node root,int value)
    {

        if(root == null)
        {
            Node newNode = new Node();
            newNode.data = value;
            root = newNode;
            return root;
        }
        if(root.data > value)
        {
            Node n = Insert(root.left, value);
            if(root.left == null)
            {
                root.left = n;
            }
        }
        else
        {
            Node n = Insert(root.right,value);
            if(root.right == null)
            {
                root.right = n;
            }
        }
        return root;
    }



}
