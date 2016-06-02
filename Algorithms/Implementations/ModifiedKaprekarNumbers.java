package Algorithms.Implementations;

import java.util.Scanner;

/**
 * Created by shubhamgoyal on 4/14/16.
 */
public class ModifiedKaprekarNumbers {

    public static int countDigit(long num)
    {
        int d = 0;
        while(num != 0)
        {
            num /= 10;
            d++;
        }

        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        boolean flag = false;
        for(long i = start; i <= end; i++)
        {
            long num = i * i;
            String data = Long.toString(num);
            int d = countDigit(i);
            long n = 0;
            long diff = 1;
            for(int j = d - 1; j >= 0; j--)
            {
                n = (num % 10) * diff + n;
                diff *= 10;
                num = num / 10;
            }
            if(num + n == i)
            {
                flag = true;
                System.out.print(i + " ");
            }

        }
        if(flag != true)
        {
            System.out.println("INVALID RANGE");
        }

    }
}
