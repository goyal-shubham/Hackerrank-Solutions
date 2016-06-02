package Algorithms.Implementations;

import java.util.Scanner;

/**
 * Created by shubhamgoyal on 4/14/16.
 * https://www.hackerrank.com/challenges/bear-and-workbook
 */
public class LisasWorkbook {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int page = 1;
        int count = 0;
        for(int i = 0; i < n; i++)
        {
            int p = sc.nextInt();
            for(int j = 1; j <= p ; j++)
            {
                if(j == page)
                {
                    count++;
                }
                if(j % k == 0 || j == p)
                {
                    page++;
                }
            }

        }

        System.out.println(count);


    }

}
