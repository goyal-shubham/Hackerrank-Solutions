package ProjectEuler;

import java.util.Scanner;

/**
 * Created by shubhamgoyal on 5/5/16.
 */
public class Euler0020
{
    static int digits = 1;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++)
        {
            int n = sc.nextInt();
            int[] data = getFactorial(n);
            System.out.println(getSum(data));
        }
    }

    private static int[] getFactorial(int n)
    {
        int num = 1;


        int[] result = new int[5000];
        result[0] = 1;
        int carry = 0;

        int j = 2;
        while(j <= n)
        {
            for(int i = 0; i < digits; i++ )
            {
                num = (result[i] * j ) + carry;
                result[i] = num % 10;
                carry = num / 10;
            }
            while(carry > 0)
            {
                result[digits] = carry % 10;
                carry /= 10;
                digits++;
            }
            j++;
        }

        return result;

    }

    private static int getSum(int[] data)
    {
        int sum = 0;
        for(int i = 0; i < digits; i++)
        {
            sum += data[i];
        }
        return sum;
    }
}
