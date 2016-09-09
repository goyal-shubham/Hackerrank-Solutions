package DataStructure.Trees;

/**
 * Created by shubhamgoyal on 9/4/16.
 */
public class BinarySearchTreeLowestCommonAncestor
{


 /* Node is defined as :
 class Node
    int data;
    Node left;
    Node right;

    */

    static Node lca(Node root,int v1,int v2)
    {
        if(root == null)
        {
            return null;
        }
        if(v1 == root.data || v2 == root.data)
        {
            return root;
        }
        Node temp1 = root;
        Node temp2 = root;
        Node ans = root;
        while(temp1 == temp2)
        {
            ans = temp1;
            if(v1 <= temp1.data)
            {
                temp1 = temp1.left;
            }
            else
            {
                temp1 = temp1.right;
            }
            if(v2 <= temp2.data)
            {
                temp2 = temp2.left;
            }
            else
            {
                temp2 = temp2.right;
            }
        }

        return ans;
    }
}
