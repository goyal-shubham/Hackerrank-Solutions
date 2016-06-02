package HackerrankApril2016;

import java.util.Scanner;

/**
 * Created by shubhamgoyal on 4/20/16.
 */
public class HackApril2016 {

    public static String getString(String s)
    {
        char c1 = s.charAt(0);
        StringBuilder s1 = new StringBuilder();
        boolean flag = false, flag1 = false;
        int n = s.length();
        for(int i = 1; i < n; i++)
        {
            char c2 = s.charAt(i);
            if(c1 == c2)
            {
                i++;
                flag = true;
                if(i == n)
                {
                    flag1 = false;
                    break;
                }
                flag1 = true;
                c1 = s.charAt(i);
            }
            else
            {
                s1.append(c1);
                flag1 = true;
                c1 = c2;
            }
        }

        if(flag1 == true)
        {
            s1.append(c1);
        }

        if(s1.length() == 0)
        {
            return "Empty String";
        }
        else if(s.length() == s1.length())
        {
            return s;
        }
        else
        {
            return getString(s1.toString());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(getString(s));
    }
}
