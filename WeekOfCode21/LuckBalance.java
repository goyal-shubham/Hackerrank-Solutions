package WeekOfCode21;

import java.util.*;

/**
 * Lena is preparing for important coding competition that is preceded by  sequential preliminary contests. She believes in "saving luck", and wants to check her theory. Each contest is described by two integers,  and :

 is the amount of luck that can be gained by winning the contest. If Lena wins the contest, her luck balance will decrease by ; if she loses it, her luck balance will increase by .
 denotes the contest's importance rating. It's equal to  if the contest is important, and it's equal to  if it's unimportant.
 If Lena loses no more than  important contests, what is the maximum amount of luck she can have after competing in all the preliminary contests? This value may be negative.

 Input Format

 The first line contains two space-separated integers,  (the number of preliminary contests) and  (the maximum number of important contests Lena can lose), respectively.
 Each line  of the  subsequent lines contain two space-separated integers,  (the contest's luck balance) and (the contest's importance rating), respectively.

 Constraints

 Output Format

 Print a single integer denoting the maximum amount of luck Lena can have after all the contests.

 Link : https://www.hackerrank.com/contests/w21/challenges/luck-balance
 */

/**
 * Created by shubhamgoyal on 6/27/16.
 */
public class LuckBalance
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int totalLuck = 0;
        ArrayList<Integer> importantEventLuck = new ArrayList<>();
        for(int i = 0; i < N; i++)
        {
            int luck = sc.nextInt();
            int importance = sc.nextInt();
            if(importance == 0)
            {
                totalLuck += luck;
            }
            else
            {
                importantEventLuck.add(luck);
            }
        }
        Collections.sort(importantEventLuck, Collections.reverseOrder());
        for(int luck : importantEventLuck)
        {
            if(K != 0)
            {
                totalLuck += luck;
                K--;
            }
            else
            {
                totalLuck -= luck;
            }

        }

        System.out.println(totalLuck);
    }
}
