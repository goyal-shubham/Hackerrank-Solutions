package DataStructure.Arrays;

import java.util.Scanner;

/**
 * Created by shubhamgoyal on 8/24/16.
 */
public class LeftRotation
{
    public static void printArray(int[] data)
    {
        for(int i = 0; i < data.length; i++)
        {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void rotateArray(int[] data, int offset)
    {
        int n = data.length;
        if(offset == n)
        {
            printArray(data);
            return;
        }
        else if ( offset > n)
        {
            offset %= n;
        }
        int temp = data[offset];
        for(int i = 0; i < n; i++)
        {
            data[offset] = data[i];
            offset++;
            if(offset >= n)
            {
                offset = 0;
            }
        }
        data[offset] = temp;
        printArray(data);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] data = new int[n];
        for(int i = 0; i < n; i++)
        {
            data[i] = sc.nextInt();
        }

        rotateArray(data, d);
    }
}
