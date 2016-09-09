package WeekOfCode21;

import java.util.Scanner;

/**
 * There are two kangaroos on an x-axis ready to jump in the positive direction (i.e, toward positive infinity). The first kangaroo starts at location  and moves at a rate of  meters per jump. The second kangaroo starts at location  and moves at a rate of  meters per jump. Given the starting locations and movement rates for each kangaroo, can you determine if they'll ever land at the same location at the same time?

 Input Format

 A single line of four space-separated integers denoting the respective values of , , , and .

 Constraints

 Output Format

 Print YES if they can land on the same location at the same time; otherwise, print NO.

 Note: The two kangaroos must land at the same location after making the same number of jumps.

 Link : - https://www.hackerrank.com/contests/w21/challenges/kangaroo
 */

/**
 * Created by shubhamgoyal on 6/27/16.
 */
public class Kangaroo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int location1 = sc.nextInt();
        int speed1 = sc.nextInt();
        int location2 = sc.nextInt();
        int speed2 = sc.nextInt();

        int distance = Math.abs(location1 - location2);

        while(true)
        {
            location1 += speed1;
            location2 += speed2;

            if(location1 == location2)
            {
                System.out.println("YES");
                break;
            }
            else if(Math.abs(location1 - location2) >= distance)
            {
                System.out.println("NO");
                break;
            }
            else
            {
                distance = Math.abs(location1 - location2);
            }
        }
    }
}
