package ProjectEuler;

import java.util.Scanner;

/**
 * Created by shubhamgoyal on 5/5/16.
 */
public class Euler0019
{
    static int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean checkLeap(long y1)
    {
        if(y1 % 100 == 0 )
        {
            if(y1 % 400 == 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else if(y1 % 4 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static int getFirstDay(long y1, int m1)
    {
        int start_year = 1900;
        int start_month = 1;
        int total_days = 1;
        long temp = y1;
        y1--;
        while(y1 >= start_year)
        {
            if(checkLeap(y1))
            {
                total_days += 366;
            }
            else
            {
                total_days += 365;
            }
            y1--;
        }
        while(m1 - 1 > start_month)
        {
            if(m1 == 3)
            {
                total_days += checkLeap(temp) ? 29 : 28;
            }
            else
            {
                total_days += months[m1 - 1];
            }
            m1--;
        }
        return total_days;
    }

    public static int getFirstDay(int m1 , boolean isLeapYear)
    {
        int day1 = 0;
        if(m1==1 || m1==3 || m1==5 || m1==7 || m1==8 || m1==10 || m1==12){
            //January,March,May,July,August,October,December
            day1+=3;
        } else if(m1==4 || m1==6 || m1==9 || m1==11){
            //April,June,September,November
            day1+=2;
        } else if(m1==2 && isLeapYear){
            //February has 29 days in a Leap Year
            day1+=1;
        }

        if(day1>7){
            day1=day1-7;
        }

        return day1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j = 0; j < t; j++)
        {
            long y1 =  Long.parseLong(sc.next());
            int mon1 =  Integer.valueOf(sc.next());
            int d1 =  Integer.valueOf(sc.next());

            long y2 =  Long.parseLong(sc.next());
            int m2 =  Integer.valueOf(sc.next());
            int d2 =  Integer.valueOf(sc.next());

            int total1 = getFirstDay(y1, mon1);
//            int total2 = getFirstDay(y2, m2);

            int day1 = total1 % 7;

            if(d1 > 1)
            {
                mon1++;
            }

            int count = 0;

            int start = mon1;
            int end = 12;
            while(y1 <= y2 )
            {
                if(y1 == y2)
                {
                    end = m2;
                }
                boolean isLeapYear = checkLeap(y1);
                for(int i = start; i <= end; i++)
                {
                    day1 += getFirstDay(i, isLeapYear);
                    if(day1 % 7 == 0)
                    {
                        count++;
                    }
                }
                start = 1;
                y1++;
            }
            System.out.println(count);
        }
    }
}
