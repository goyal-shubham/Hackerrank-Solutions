package ProjectEuler;

import java.util.Scanner;

/**
 * Created by shubhamgoyal on 5/4/16.
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler012
 */
public class Euler12
{


//    int[] t_num = new int[Integer.MAX_VALUE];
    public static int getDivisors(int n)
    {
        int count = 0;
        int i;
        for(i = 1; i * i < n; i++)
        {
            if(n % i == 0)
            {
                count += 2;
            }
        }

        if(i * i == n)
        {
            count++;
        }
        return count;
    }

    public static int getResult(int n1)
    {
        int first, second;
        int n = 1;
        while(true)
        {
            if(n % 2 == 0)
            {
                first = getDivisors(n / 2);
                second = getDivisors(n + 1);
            }
            else
            {
                first = getDivisors((n + 1) / 2);
                second = getDivisors(n);
            }
            if(first * second > n1)
            {
                return (n) * (n + 1) / 2;
            }
            else
            {
                n++;
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++)
        {
            int n = sc.nextInt();
            System.out.println(getResult(n));

        }
    }
}
