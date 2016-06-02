package MayWorldCodeSprint;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by shubhamgoyal on 5/21/16.
 */
public class RichieRich
{

    public static String getResult(String s , int n, int k)
    {

        int[] num = new int[n];
        int result = 0;
        if( n <= k)
        {
            StringBuilder sb = new StringBuilder();
            for(int i1 = 0; i1 < n; i1++)
            {
                sb.append(9);
            }
            return sb.toString();
        }

        for(int i = 0; i < n; i++)
        {
            num[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
            //System.out.println(num[i]);
        }

        int i = 0;
        int j = n - 1;
        boolean[] flag = new boolean[n];

        while(i <= j && k > 0)
        {
            if(num[i] != num[j])
            {
                int max = Math.max(num[i], num[j]);
                flag[i] = num[i] == max ;
                flag[j] = num[j] == max ;
                num[i] = max;
                num[j] = max;
                k--;
            }

            i++;
            j--;
        }

        if(k==0)
        {
            while(i <= j)
            {
                if(num[i] != num[j])
                {
                    return "-1";
                }
                i++;
                j--;
            }
        }

            i = 0;
            j = n - 1;
            while(i <= j && k > 0)
            {
                if(num[i] != 9)
                {
                    if(flag[i] == true && k - 1 >= 0 || flag[j] == true && k - 1>= 0 || i ==j && k - 1 >= 0)
                    {
                        num[i] = 9;
                        num[j] = 9;
                        k--;
                    }
                    else if(k - 2 >= 0)
                    {
                        num[i] = 9;
                        num[j] = 9;
                        k = k - 2;
                    }
                }
                i++;
                j--;
            }

        StringBuilder sb = new StringBuilder();
        for(int i1 = 0; i1 < n; i1++)
        {
            sb.append(num[i1]);
        }
        return sb.toString();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int n, k;
            n = sc.nextInt();
            k = sc.nextInt();

            String data = sc.next();
            // System.out.println("data : " + data);

            System.out.println(getResult(data, n, k));
        }

    }
}
