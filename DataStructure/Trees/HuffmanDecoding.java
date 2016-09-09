package DataStructure.Trees;

/**
 * Created by shubhamgoyal on 9/4/16.
 */
public class HuffmanDecoding
{
    /*
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;

*/

    void decode(String s ,Node root)
    {
        Node temp = root;
        String ans = "";
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '0')
            {
                temp = temp.left;
            }
            else
            {
                temp = temp.right;
            }
            if(temp.right == null && temp.left == null)
            {
                ans += temp.data;
                temp = root;
            }
        }

        System.out.println(ans);


    }

}
