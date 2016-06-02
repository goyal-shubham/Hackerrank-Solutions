package WeekOfCode20;

import java.util.Scanner;

/**
 * Created by shubhamgoyal on 5/26/16.
 */
public class NonDivisibleSubset
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++)
        {
            a[a_i] = in.nextInt();
        }

        int aModK[] = new int[k];

        for(int i = 0; i < n; i++)
        {
            int remainder = a[i] % k;
            aModK[remainder]++;
        }

        int result = 0;
        if(k % 2 == 0)
        {
            if(aModK[0] > 0)
            {
                result++;
            }

            if(aModK[k/2] > 0)
            {
                result++;
            }

            for(int i = 1; i < k/2; i++)
            {
                result+= Math.max(aModK[i], aModK[k - i]);
            }
        }
        else
        {
            if(aModK[0] > 0)
            {
                result++;
            }

            for (int i = 1; i < (k + 1) / 2; i++)
            {
                if (aModK[i] < aModK[k - i])
                {
                    result += aModK[k - i];
                }
                else
                {
                    result += aModK[i];
                }

            }
        }
        System.out.println(result);
    }
}
