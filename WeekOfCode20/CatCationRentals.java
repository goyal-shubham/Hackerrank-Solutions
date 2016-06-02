package WeekOfCode20;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by shubhamgoyal on 5/28/16.
 */
public class CatCationRentals
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int k = sc.nextInt();

        ArrayList<days> bookings = new ArrayList<>();

        for(int i = 0; i < n; i++)
        {
            bookings.add(new days(sc.nextInt() , sc.nextInt()));
        }

        for(int i = 0; i < k; i++)
        {
            int result = 0;
            boolean[] confirmation = new boolean[d + 1];
            int minDays = sc.nextInt();
            for(days day : bookings)
            {
                boolean flag = false;
                if(day.end - day.start + 1 < minDays)
                {
                    continue;
                }
                for(int j = day.start; j <= day.end; j++)
                {
                    if(confirmation[j] == true)
                    {
                        flag = true;
                        break;
                    }

                }
                if(!flag)
                {
                    for(int j = day.start; j <= day.end; j++)
                    {
                        confirmation[j] = true;
                        result++;
                    }
                }

            }
            System.out.println(result);
        }



    }
}

class days
{
    int start;
    int end;

    public days( int start, int end)
    {
        this.end = end;
        this.start = start;
    }
}
