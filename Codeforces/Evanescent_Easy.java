// https://codeforces.com/problemset/problem/2254/B

import java.util.*;
import java.lang.*;
import java.io.*;

public class Solution 
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t--> 0) {
            int n = input.nextInt();
            String s = input.next();
            int baseLen = 0;
            for (int i = 0; i < n; i++) {
                if (i == 0 || s.charAt(i) != s.charAt(i - 1)) {
                    baseLen++;
                }
            }
            boolean reduction2 = false;
            boolean reduction1 = false;

            for (int i = 1; i < n - 1; i++) {
                if (s.charAt(i) != s.charAt(i - 1) && s.charAt(i) != s.charAt(i + 1)) {
                    if (s.charAt(i - 1) == s.charAt(i + 1)) {
                        reduction2 = true;
                    } else {
                        reduction1 = true;
                    }
                }
            }
            if (reduction2) {
                System.out.println(baseLen - 2);
            } else if (reduction1) {
                System.out.println(baseLen - 1);
            } else {
                System.out.println(baseLen);
            }

        }


    }
}
