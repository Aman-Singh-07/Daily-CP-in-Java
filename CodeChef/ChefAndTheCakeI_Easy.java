// https://www.codechef.com/problems/CAKE1AM

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
            long x1A = input.nextLong();
            long y1A = input.nextLong();
            long x2A = input.nextLong();
            long y2A = input.nextLong();

            long x1B = input.nextLong();
            long y1B = input.nextLong();
            long x2B = input.nextLong();
            long y2B = input.nextLong();


            long areaA = (x2A - x1A) * (y2A - y1A);
            long areaB = (x2B - x1B) * (y2B - y1B);


            long xOverlap = Math.max(0, Math.min(x2A, x2B) - Math.max(x1A, x1B));
            long yOverlap = Math.max(0, Math.min(y2A, y2B) - Math.max(y1A, y1B));

            long overlapArea = xOverlap * yOverlap;

            System.out.println(areaA + areaB - overlapArea);
        }
    }
}
