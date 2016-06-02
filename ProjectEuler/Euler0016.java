package ProjectEuler;

import java.util.Scanner;

/**
 * Created by shubhamgoyal on 5/5/16.
 */
public class Euler0016
{
    public static int checkSum(int num)
    {
        int sum = 0;
        while(num != 0)
        {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++)
        {
            int n = sc.nextInt();
            double num = Math.pow(2 , n);
            System.out.println(num);
            System.out.println(checkSum((int)num));
        }
    }
}
