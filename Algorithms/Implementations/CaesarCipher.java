package Algorithms.Implementations;

import java.util.Scanner;

/**
 * Created by shubhamgoyal on 4/14/16.
 */
public class CaesarCipher {

    public static char getCode(char c, int k) {
        if (!Character.isAlphabetic(c))
        {
            return c;
        }
        char base = 'A';
        if (c >= 'a')
        {
            base = 'a';
        }
        return (char)(((c - base + k) % 26) + base);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        char[] data = s.toCharArray();
        for(int i = 0; i < data.length; i++)
        {
            data[i] = getCode(data[i], k);
        }

        System.out.println(data);

    }
}
