package Strings;

import java.util.Scanner;

/**
 * Created by shubhamgoyal on 5/6/16.
 */
public class BearandSteadyGene
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String gene = sc.next();

        int eachCount = n / 4;
        char[] data = gene.toCharArray();
        int[] totalCount = new int[4];
        int first = 0, last = 0;
        for(int i = 0; i < n; i++)
        {
            int temp = -1;
            if(data[i] == 'A')
            {
                temp = 0;
            }
            else if(data[i] == 'C')
            {
                temp = 1;
            }
            else if(data[i] == 'G')
            {
                temp = 2;
            }
            else
            {
                temp = 3;
            }
            totalCount[temp]++;
            if(totalCount[temp] > eachCount)
            {
                if(last == 0)
                {
                    first = i;
                    last = i;
                }
                else
                {
                    last = i;
                }
            }

        }
        System.out.println(last - first + 1);
    }
}

