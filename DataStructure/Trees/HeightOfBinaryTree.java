package DataStructure.Trees;

/**
 * Created by shubhamgoyal on 9/4/16.
 */
public class HeightOfBinaryTree
{
    /*

 class Node
    int data;
    Node left;
    Node right;
*/
    int height(Node root)
    {
        if(root == null)
        {
            return -1;
        }
        int leftHeight = height(root.left) ;
        int rightHeight = height(root.right) ;
        return leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1;
    }

}
