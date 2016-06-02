import java.io.*;
import java.util.*;

public class Euler002{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

       for( ; t > 0; t--){
            long n;
            n = sc.nextLong();
            long a = 1;
            long b = 2;
            long sum = 0;
            while(b <= n)
               {
               sum += b;
               long d = (2 * b) + a;
                b = d + a + b;
                a = d;
           }
          
                
                System.out.println(sum);
            }
        }
    }
