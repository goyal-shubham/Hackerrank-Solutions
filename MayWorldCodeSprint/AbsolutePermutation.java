package MayWorldCodeSprint;

import java.util.Scanner;
import java.util.jar.Pack200;

/**
 * Created by shubhamgoyal on 5/21/16.
 */
public class AbsolutePermutation
{
    public static int n, k;

    //    public static boolean checkField(int[] result, int i)
    //    {
    //        if (i > n)
    //        {
    //            return true;
    //        }
    //
    //        int pos1 = i - k;
    //        int pos2 = i + k;
    //        if (pos1 > 0 && pos1 <= n && result[pos1] != 0)
    //        {
    //            result[pos1] = i;
    //        }
    //        if (!checkField(result, pos1 + 1))
    //        {
    //            if (pos2 > 0 && pos2 <= n && result[pos2] != 0)
    //            {
    //                result[pos1] = i;
    //            }
    //            return checkField(result, pos2);
    //        }
    //        return true;
    //
    //    }
    //
    //    public static void findResult()
    //    {
    //        if (k > n / 2)
    //        {
    //            System.out.println("-1");
    //            return;
    //        }
    //
    //        if (k == 0)
    //        {
    //            for (int i = 1; i <= n; i++)
    //            {
    //                System.out.print(i + " ");
    //            }
    //            System.out.println();
    //            return;
    //        }
    //
    //        int[] result = new int[n + 1];
    //        for (int i = 0; i <= n; i++)
    //        {
    //            result[i] = 0;
    //        }
    //        result[0] = 0;
    //        result[1] = 1 + k;
    //        result[n] = n - k;
    //        for (int i = 2; i < n; i++)
    //        {
    //            if (checkField(result, 2))
    //            {
    //                break;
    //            }
    //            else
    //            {
    //                System.out.println("-1");
    //                return;
    //            }
    //            //            if(result[pos] != 0)
    //            //            {
    //            //                result[pos] = i;
    //            //            }
    //            //            else
    //            //            {
    //            //                System.out.println(-1);
    //            //                return;
    //            //            }
    //        }
    //        for (int i = 1; i <= n; i++)
    //        {
    //            System.out.print(result[i] + " ");
    //        }
    //        System.out.println();
    //    }


    public static void findResult()
    {
        if (k == 0)
        {
            for(int i = 1; i <= n; i++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        if (n % (2 * k)!= 0)
        {
            System.out.println("-1");
            return;
        }



        int[] result = new int[n + 1];
        int count = n / (2 * k);
        for (int i = 0; i < count; i++)
        {
            int start = i * (2 * k) + 1;
            int end = start + (2 * k) - 1 ;
            for (int j = start ; j <  start + k; j++ , end--)
            {
                if(result[j] == 0)
                {
                    result[j] = j + k;

                }
                else
                {
                    System.out.println("-1");
                    return;
                }
                if(result[end] == 0)
                {
                    result[end] = end - k;
                }
                else
                {
                    System.out.println("-1");
                    return;
                }

            }
        }

        for(int i = 1; i <= n; i++)
        {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        return;


        //        int[] result = new int[n + 1];
        //        result[1] = 1  + k;
        //        result[n] = n - k;
        //        for(int i = 1; i <= k; i++)
        //        {
        //            int a = result[i + k];
        //            int b = result[n + 1 - i - k ];
        //             if(a != 0)
        //             {
        //                 result[i + k] = i;
        //             }
        //            else
        //             {
        //                 System.out.println("-1");
        //                 return;
        //             }
        //            if( b != 0)
        //            {
        //                result[n + 1 - i - k ] = n + 1 - i;
        //            }
        //
        //        }


    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            n = sc.nextInt();
            k = sc.nextInt();
            findResult();
        }


    }
}
