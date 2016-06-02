package Algorithms.Implementations;

import java.util.Scanner;

/**
 * Created by shubhamgoyal on 4/14/16.
 */
public class TaumAndBday {


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            for(int a0 = 0; a0 < t; a0++){
                int b = in.nextInt();
                int w = in.nextInt();
                int x = in.nextInt();
                int y = in.nextInt();
                int z = in.nextInt();
                if(x + z < y)
                {
                    y = x + z;
                }
                else if(y + z < x)
                {
                    x = y + z;
                }

                long cost = (b * x) + (w * y);
                System.out.println(cost);

            }
        }

}
