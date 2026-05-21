// https://codeforces.com/problemset/problem/2230/B

import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t--> 0) {
            String s = input.next();

            int count4 = 0;
            int total2 = 0;

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == '4') {
                    count4++;
                } else if (ch == '2') {
                    total2++;
                }
            }

            int current13OnLeft = 0;
            int current2OnRight = total2;
            int min = current2OnRight;
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == '2') {
                    current2OnRight--;
                } else if (ch == '1' || ch == '3') {
                    current13OnLeft++;
                }

                int curr = current13OnLeft + current2OnRight;
                if (curr < min) {
                    min = curr;
                }
            }

            System.out.println(count4 + min);
        }
    }
}
