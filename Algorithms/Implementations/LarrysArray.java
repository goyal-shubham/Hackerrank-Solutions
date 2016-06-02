package Algorithms.Implementations;

import java.util.Scanner;

/**
 * Created by shubhamgoyal on 5/6/16.
 * https://www.hackerrank.com/challenges/larrys-array
 */
public class LarrysArray
{

    //Solution by reading editorial
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int[] data = new int[n + 1];

            for (int i = 1; i <= n; i++)
            {
                data[i] = sc.nextInt();
            }

            for(int  j = 1; j <= n; j++)
            {
                for(int i = n - 2; i >= 1; i--)
                {
                    while( Math.min( Math.min( data[i], data[i+1]), data[i+2]) != data[i])
                    {
                        int temp = data[i];
                        data[i] = data[i+1];
                        data[i+1] = data[i+2];
                        data[i+2] = temp;
                    }
                }
            }
            boolean flag =true;
            for(int i = 2; i <= n; i++)
            {
                if( data[i] < data[i - 1])
                {
                    flag = false;
                    break;
                }
            }

            if(flag)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }

        }
    }
//    public static int rotate( int index, int[] data)
//    {
//         int count = 0;
//         while( Math.min( Math.min( data[i], data[i+1]), data[i+2]) != data[i])
//         {
//             int temp = data[index];
//            data[index] = data[index + 1];
//            data[index + 1] = data[index + 2];
//            data[index + 2] = temp;
//            count++;
//
//        }
//
//        return data[index];
//    }
//
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t-- > 0)
//        {
//            int n = sc.nextInt();
//            int[] data = new int[n];
//            for(int i = 0; i < n; i++)
//            {
//                data[i] = sc.nextInt();
//            }
//
//            int previous = 0;
//            boolean flag = false;
//            int i;
//            for(i = 0; i < n - 2; i++)
//            {
//                int temp = rotate(i, data);
//
//                if(previous  > temp)
//                {
//                    flag = true;
//                    break;
//                }
//                previous = temp;
//            }
////
////            for( ; i < n; i++)
////            {
////                if(data[i] < previous)
////                {
////                    flag = true;
////                    break;
////                }
////                previous = data[i];
////
////            }
//            if(flag == true)
//            {
//                System.out.println("NO");
//            }
//            else
//            {
//                System.out.println("YES");
//            }
//        }
//    }


}
