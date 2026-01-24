// https://www.codechef.com/problems/MAANDI?tab=statement

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t--> 0) {
            long n = input.nextLong();
            int ans = 0;
            long sqrtn = (long) Math.sqrt(n);
            for (long i = 1; i <= sqrtn; i++) {
                if (n % i == 0) {
                    if (isSpecial(i)) ans++;
                    long other = n / i;
                    if (i != other && isSpecial(other)) ans++;
                }
            }
            System.out.println(ans);
        }

    }
    static boolean isSpecial(long num) {
        while (num > 0) {
            long d = num % 10;
            if (d == 4 || d == 7) return true;
            num /= 10;
        }
        return false;
    }

}
