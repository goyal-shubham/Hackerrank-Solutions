package ProjectEuler;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by shubhamgoyal on 5/4/16.
 */
public class Euler0014
{

    static int limit = 50000000;
    static int[] data = new int[limit];

    public static int getResult(long n)
    {

        if(n > limit)
        {
            return getCount(n);
        }

        int index = (int) n  ;
        if(data[index] == 0)
        {
            data[index] = getCount(n);
        }
        return data[index];


    }

    public static int getCount(long n)
    {
        if(n % 2 == 0)
        {
            return getResult(n / 2) + 1;
        }
        else
        {
           return getResult( (3 * n + 1) ) + 1;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++)
        {
            int n = sc.nextInt();
            int max = Integer.MIN_VALUE;
            long result = n;
            data[1] = 1;
            for(int j = n; j >= 2; j--)
            {
                int x = getResult(j);
//                System.out.println("number" + j + " result " + x);
                if( x > max  )
                {
                    max = x;
                    result = j;
                }
            }

            System.out.println(result);

        }
    }
}
