/**
 * Created by shubhamgoyal on 4/13/16.
 * https://www.hackerrank.com/challenges/swap-nodes-algo
 */
import java.util.*;


public class SwapNode {

    public static void inorder(Trees.Node root )
    {
        if(root == null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void swapChild(Trees.Node n)
    {
        if(n == null)
        {
            return;
        }
        Trees.Node temp = n.left;
        n.left = n.right;
        n.right = temp;
    }

    public static void swapNodes(Trees.Node n, int k)
    {
        if( n == null)
        {
            return ;
        }
        if(n.depth % k == 0)
        {
            swapChild(n);
        }
        swapNodes(n.left, k);
        swapNodes(n.right, k);

    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Trees.Node[] arr = new Trees.Node[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = new Trees.Node(i + 1, 1);
        }

        for(int i = 0; i < n; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int depth = arr[i].depth;
            if(a != -1)
            {
                arr[a - 1].depth = depth + 1;
                arr[i].left = arr[a - 1];
            }
            if(b != -1)
            {
                arr[b - 1].depth = depth + 1;
                arr[i].right = arr[b - 1];
            }
        }

        int t = sc.nextInt();
        Trees.Node root = arr[0];
        for(int j = 0; j < t; j++)
        {
            int k = sc.nextInt();
            swapNodes(root, k);
            inorder(arr[0]);
            System.out.println();
        }
    }


}



class Node
{
    int data;
    int depth;
    Trees.Node left;
    Trees.Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
    Node(int data, int depth)
    {
        this.data = data;
        this.depth = depth;
        left = null;
        right = null;
    }
}
