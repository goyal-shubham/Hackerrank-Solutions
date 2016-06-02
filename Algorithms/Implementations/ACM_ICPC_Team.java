package Algorithms.Implementations;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by shubhamgoyal on 4/14/16.
 */
public class ACM_ICPC_Team {

    public static int countOne(String s1 , String s2)
    {

        int count = 0;
        for (int i = 0; i < s1.length(); i++)
        {
            if(s1.charAt(i) == '1' || s2.charAt(i) == '1')
            {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String topic[] = new String[n];
        for(int topic_i=0; topic_i < n; topic_i++){
            topic[topic_i] = in.next();
        }

        int max = 0;
        int count = 0;
        for(int i = 0 ; i < n - 1; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                int one_count = countOne(topic[i] , topic[j]);
                if(max == one_count)
                {
                    count++;
                }
                if(max < one_count)
                {
                    max = one_count;
                    count = 1;
                }

            }
        }
        System.out.println(max);
        System.out.println(count);

    }
}
