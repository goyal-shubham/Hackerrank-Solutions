package MayWorldCodeSprint;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by shubhamgoyal on 5/21/16.
 */
public class BeautifulQuadrapulets
{
//    public static int countNumbers(int[] data)
//    {
//        int total = 0;
//
//        return total;
//
//    }
    public boolean isPowerOfTwo (int x)
    {
        return (
                x == 1 || x == 2 || x == 4 || x == 8 || x == 16 || x == 32 ||
                        x == 64 || x == 128 || x == 256 || x == 512 || x == 1024 ||
                        x == 2048 || x == 4096 || x == 8192 || x == 16384 ||
                        x == 32768 || x == 65536 || x == 131072 || x == 262144 ||
                        x == 524288 || x == 1048576 || x == 2097152 ||
                        x == 4194304 || x == 8388608 || x == 16777216 ||
                        x == 33554432 || x == 67108864 || x == 134217728 ||
                        x == 268435456 || x == 536870912 || x == 1073741824);
    }

    public static int total , sum , product;
    public static void countResult(int[] data)
    {
      //  System.out.println(Arrays.toString(data));
        int count = 0;
        int total1 = 0;
        int total2 = 0;
        for(int i = 1; i <= data[0]; i++)
        {
            for(int j = i; j <= data[1]; j++)
            {
                //total2 += data[3] - j  + 1;
                for(int k = j; k <= data[2]; k++)
                {
                    //System.out.println(i + " " + j);
                    for(int l = k; l <= data[3]; l++)
                    {
                        total1++;
                        System.out.println(i + " " + j + " " + k + " " + l + " ");
                        System.out.println(total1 );
                        //System.out.println("total2 : " + total2);
                         int a = (i ^ j) ^ (k ^ l);
                        if(a != 0 && i != j)
                        {
                            count++;
                            //System.out.println(i + " " + j + " " + k + " " + l + " ");

                        }
                       // System.out.println( "A = " + a + "count : " + count);
                    }
                }
            }
        }
        System.out.println(count + " total :" + total1);
        System.out.println("total2  : " + total2);

    }

    public static void getResult(int[] data)
    {
        int count = 0;

        for(int i = 1; i <= data[0]; i++)
        {
            for(int j = i; j <= data[1]; j++)
            {
                if(i == j)
                {
//                    int k = j, l = j;
//                    while(k <= data[2] && l <= data[3])
//                    {
//                        System.out.println(i + " " + j + " " + k + " " + l + " ");
//
//                        k++;
//                        l++;
//                        count++;
//
//                    }
                    count += data[2] - j + 1;
                }
                else
                {
                    if(i % 2 == 0 && j % 2 == 0 || j % 2 == 1 && i % 2 == 1)
                    {

                        for(int k = j; k <= data[2]; k++)
                        {
                            for(int l = k + 1;  l <= data[3]; l++)
                            {
                                int a = (i ^ j) ^ (k ^ l);
                                if(a != 0)
                                {
                                    count++;
                                    System.out.println(i + " " + j + " " + k + " " + l + " ");
                                }

                            }


                        }
                    }
                    else
                    {
                        for(int k = j; k <= data[2]; k++)
                        {
                            for(int l = k + 1;  l <= data[3]; l++)
                            {
                                int a = (i ^ j) ^ (k ^ l);
                                if(a != 0)
                                {
                                    count++;
                                    System.out.println(i + " " + j + " " + k + " " + l + " ");

                                }

                            }
                        }

                    }
                }

            }
        }

        System.out.println(total + " " + count);

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] data = new int[4];
        sum = 0;
        product = 1;
        for(int i = 0; i < 4; i++)
        {
            data[i] = sc.nextInt();
            sum += data[i];
            product *= data[i];
        }
        total = product - sum;
        Arrays.sort(data);

        countResult(data);
        getResult(data);
        //System.out.println("total : " + countNumbers(data));
    }
}
