import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by shubhamgoyal on 4/22/16.
 */
public class SmritiandtheStrings {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0)
        {

            String s1 = sc.nextLine();
            String[] s2 = s1.split(" ");
            String s = s2[0];
            int m = Integer.parseInt(s2[1]);
            char[] c = s.toCharArray();
            char[] original = Arrays.copyOf(c, c.length);
            Arrays.sort(c);
            int n = c[m - 1];
            char data = c[c.length - 1];
            int j = 1;
            while(m - j >= 0 && n == c[m - j])
            {
                j++;
            }
            j--;
            int count = 0;
            int l = s.indexOf(data);
            boolean flag = false;
            if(l <= m )
            {
                flag = true;

            }
            if(flag )
            {
                StringBuilder sb = new StringBuilder();
                int i = l;
                count = l;
                for(; i < original.length && count < m; i++)
                {
                    if(original[i] < n)
                    {
                        count++;
                    }
                    else if(original[i] == n && j > 0)
                    {
                        count++;
                        j--;
                    }
                    else
                    {
                        sb.append(original[i]);
                    }
                }

                while(i < original.length)
                {
                    sb.append(original[i]);
                    i++;
                }
                System.out.println(sb);

            }
            else
            {
                StringBuilder sb = new StringBuilder();
                int i = 0;
                for(; i < original.length && count < m; i++)
                {
                    if(original[i] < n)
                    {
                        count++;
                    }
                    else if(original[i] == n && j > 0)
                    {
                        count++;
                        j--;
                    }
                    else
                    {
                        sb.append(original[i]);
                    }
                }

                while(i < original.length)
                {
                    sb.append(original[i]);
                    i++;
                }
                System.out.println(sb);
            }

        }


    }
}
