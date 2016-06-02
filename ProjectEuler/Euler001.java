import java.io.*;
import java.util.*;

public class Euler001 {

    public static long findSum ( int n , long range)
        {
        long last = range - (range % n);
        long sum = (n + last) * (range / n ) / 2; // sum of first "range" numbers divisible by "n"
        return sum;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(n > 0) {
            long a;
            long sum ;
            a = sc.nextInt();
            a--; // if a = 20 , 3,6,9,12,15,18,5,10,15
            sum = findSum(3, a) + findSum(5, a) - findSum(15 , a);
          
            System.out.println(sum);
            n--;
        }
        
    }
}