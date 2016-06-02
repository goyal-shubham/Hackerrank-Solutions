package Algorithms.Implementations;

import java.util.Scanner;

/**
 * Created by shubhamgoyal on 4/14/16.
 */
public class TimeInWords {

    public static String[] hours = {
            "zero",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten",
            "eleven",
            "twelve",
            "one"
    };

    public static String[] minutes = {
            "zero",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten",
            "eleven",
            "twelve",
            "thirteen",
            "fourteen",
            "aaa",
            "sixteen",
            "seventeen",
            "eighteen",
            "ninteen",
            "twenty",
            "twenty one",
            "twenty two",
            "twenty three",
            "twenty four",
            "twenty five",
            "twenty six",
            "twenty seven",
            "twenty eight",
            "twenty nine",
            "thirty!!!"
    };

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        if(m == 0)
        {
            System.out.println(hours[h] + " o' clock");
        }
        else if(m == 1)
        {
            System.out.println(minutes[m] + " minute past " + hours[h]);
        }
        else if(m == 15)
        {
            System.out.println("quarter past " + hours[h]);
        }
        else if(m < 30)
        {
            System.out.println(minutes[m] + " minutes past " + hours[h]);
        }

        else if(m == 30)
        {
            System.out.println("half past " + hours[h]);
        }
        else if( m == 45)
        {
            System.out.println("quarter to " + hours[h + 1]);
        }
        else
        {
            System.out.println(minutes[60 - m] + " minutes to " + hours[h + 1]);
        }

    }
}
