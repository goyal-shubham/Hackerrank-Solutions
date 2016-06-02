package Algorithms.Implementations;

import java.util.Scanner;

/**
 * Created by shubhamgoyal on 4/14/16.
 */
public class ModifiedKaprekarNumber2 {

    public static boolean checkNum(long n)
    {
        long data = n * n;
        String num = String.valueOf(n);

        String sq = String.valueOf(data);
        int len = num.length();

        if(len == sq.length())
        {
            return n == 1;
        }
        int b1 = Integer.parseInt(sq.substring(0, sq.length() - len));
        int b2 = Integer.parseInt(sq.substring(sq.length() - len));
        return b1 + b2 == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        boolean flag = false;
        for(long i = start; i <= end; i++ )
        {
            if(checkNum(i))
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
