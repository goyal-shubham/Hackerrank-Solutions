package ProjectEuler;

/**
 * Created by shubhamgoyal on 5/5/16.
 */
public class PrintArray
{
    public static void printArray(int[] data)
    {
        for(int i = 0; i < data.length; i++)
        {
            System.out.println(data[i]);
        }
    }

    public static void printArray(int[] data, int m)
    {
        for(int i = 0; i < m; i++)
        {
            System.out.println(data[i]);
        }
    }
}
