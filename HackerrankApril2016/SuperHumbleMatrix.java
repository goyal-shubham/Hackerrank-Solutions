package HackerrankApril2016;

import java.util.Scanner;

/**
 * Created by shubhamgoyal on 4/20/16.
 */
public class SuperHumbleMatrix {

    static int[]  a = new int[10000000];

    public static int factorial(int n)
    {
        if(a[n] > 0)
        {
            return a[n];
        }
        else
        {
            a[n] = n * factorial(n - 1);
            return a[n];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        a[0] = 1;
        a[1] = 1;
        a[2] = 2;
        long n = sc.nextInt();
        long m = sc.nextInt();
        if(m > n)
        {
            long temp = n;
            n = m;
            m = temp;
        }

        long result = 1;
        int j = 1;
        long max = n * m;
        for(int i = 0; i < n - 1; i++)
        {
            if(j < m)
            {
                j++;
            }
            result *= factorial(j);
        }

        while(--j > 0)
        {
            result *= factorial(j);
        }

        System.out.println(result % (Math.pow(10 , 9 ) + 7));


    }
}
