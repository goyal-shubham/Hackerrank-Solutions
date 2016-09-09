package WeekOfCode21;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Logan is cleaning his apartment. In particular, he must sort his old favorite sequence, , of  positive integers in nondecreasing order. He's tired from a long day, so he invented an easy way (in his opinion) to do this job. His algorithm can be described by the following pseudocode:

 while isNotSorted(P) do {
 WaitOneMinute();
 RandomShuffle(P)
 }
 Can you determine the expected number of minutes that Logan will spend waiting for  to be sorted?

 Input Format

 The first line contains a single integer, , denoting the size of permutation .
 The second line contains  space-separated integers describing the respective elements in the sequence's current order, .

 Constraints

 Output Format

 Print the expected number of minutes Logan must wait for  to be sorted, rounded to a scale of exactly  decimal places (i.e.,  format).

 Link: https://www.hackerrank.com/contests/w21/challenges/lazy-sorting
 */

/**
 * Created by shubhamgoyal on 6/29/16.
 */
public class LazySorting
{

    private static long[] factorials()
    {
        long[] factorial = new long[20];
        factorial[0] = factorial[1] = 1;
        for (int i = 2; i < factorial.length; i++)
        {
            factorial[i] = (factorial[i - 1] * i);
        }
        return factorial;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];
        for(int i = 0; i < n; i++)
        {
            data[i] = sc.nextInt();
        }

        long[] factorial = factorials();

        Map<Integer, Long> frequency = Arrays.stream(data).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        double answer = factorial[data.length];

        for (long values : frequency.values())
        {
            // according to the problem description, max size of permutation is in [2..18] range
            answer /= factorial[(int) values];
        }

        //        return numOfPerms;
        //        double answer = 1;
        //        while(n > 0)
        //        {
        //            answer *= n;
        //            n--;
        //        }
        //
        //        Arrays.sort(data);
        //        for(int i = 0; i < n; i++)
        //        {
        //            int temp = 2;
        //            while( i + 1 < n && data[i] == data[i + 1])
        //            {
        //                answer /= temp++;
        //                i++;
        //            }
        //        }

        System.out.printf("%.6f", answer);

    }
}
