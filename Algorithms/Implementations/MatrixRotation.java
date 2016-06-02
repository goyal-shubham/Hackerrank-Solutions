package Algorithms.Implementations;

import java.util.Scanner;

/**
 * Created by shubhamgoyal on 5/6/16.
 */
public class MatrixRotation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int num = sc.nextInt();


        int[][] data = new int[row][col];

        for(int i = 0; i < row; i ++)
        {
            for(int j = 0; j < col; j++)
            {
                data[i][j] = sc.nextInt();
            }

        }

        for(int i = 0 ; i <  Math.min(row, col) / 2 ; i++)
        {
            int totalElements = 2 * ( row + col - 2 - (4 * i));
            for(int j = 0; j < num % totalElements; j++)
            {
                int temp = data[i][i];
                int m = i, n = i;
                while(m < row - 1 - i)
                {
                    int temp2 = data[m + 1][n];
                    data[m + 1][n] = temp;
                    temp = temp2;
                    m++;
                }

                while(n < col - 1 - i)
                {
                    int temp2 = data[m][n + 1];
                    data[m][n + 1] = temp;
                    temp = temp2;
                    n++;
                }

                while(m > i)
                {
                    int temp2 = data[m - 1][n];
                    data[m - 1][n] = temp;
                    temp = temp2;
                    m--;
                }

                while(n > i)
                {
                    int temp2 = data[m][n - 1];
                    data[m][n - 1] = temp;
                    temp = temp2;
                    n--;
                }

            }

        }
        for(int i = 0; i < row; i ++)
        {
            for(int j = 0; j < col; j++)
            {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }

    }
}
