package Algorithms.Implementations;

import java.util.Scanner;

/**
 * Created by shubhamgoyal on 5/6/16.
 */
public class NewYearChaos
{
    static int[] bribes;
    private static void swapNumbers(int i, int j, int[] array) {

        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int bubbleSort(int[] data)
    {
        int n = data.length;
        int swaps = 2;
        int count = 0;
        int result = 0;

        boolean found = false;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 0; j < n - i; j++)
            {
                if(data[j] > data[j + 1])
                {
                    found = true;
                    result++;
                    bribes[data[j]]++;
                    if( bribes[data[j]] > 2)
                    {
                        return -1;
                    }
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }

            }
            if(!found)
            {
                break;
            }
        }

        return result;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            bribes = new int[n];
            int[] data = new int[n];
            for(int i = 0; i < n; i++)
            {
                data[i] = sc.nextInt() - 1;
                bribes[i] = 0;
            }
            bribes = new int[n];
            int k = bubbleSort(data);

            System.out.println(k == -1 ? "Too chaotic" : k);
        }
    }
}
