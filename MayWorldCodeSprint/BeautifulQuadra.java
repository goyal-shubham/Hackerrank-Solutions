package MayWorldCodeSprint;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by shubhamgoyal on 5/21/16.
 */
public class BeautifulQuadra
{
    public static int total , sum , product;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] data = new int[4];
        sum = 0;
        product = 1;
        for(int i = 0; i < 4; i++)
        {
            data[i] = sc.nextInt();
//            sum += data[i];
//            product *= data[i];
        }
//        total = product - sum;
        Arrays.sort(data);

        countResult(data);
        //getResult(data);
        //System.out.println("total : " + countNumbers(data));
    }

    private static void countResult(int[] data)
    {

    }
}
