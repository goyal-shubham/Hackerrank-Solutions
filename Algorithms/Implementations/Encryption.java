package Algorithms.Implementations;

import java.util.Scanner;

/**
 * Created by shubhamgoyal on 4/14/16.
 */
public class Encryption {


        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            String s = in.next();

            int len = s.length();
            int row = (int) Math.floor( Math.sqrt(len));
            int col = (int) Math.ceil(Math.sqrt(len));
            int total = row * col;

            while(total < len && row <= col)
            {
                row++;
                total = row * col;
            }
            char[][] matrix = new char[row][col];



            int a = 0;
            for(int i = 0; i < row; i++)
            {

                for(int j = 0; j < col; j++)
                {
                    if( a == len)
                    {
                        matrix[i][j] = ' ';
                    }
                    else{
                        matrix[i][j] = s.charAt(a++);

                    }
                }
                if( a == len)
                {
                    break;
                }
            }


            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < col; i++)
            {
                for(int j = 0; j < row; j++)
                {
                    if(!(matrix[j][i] == ' '))
                    {
                        sb.append(matrix[j][i]);

                    }
                }
                sb.append(" ");
            }
            System.out.println(sb.toString());
        }
    }


