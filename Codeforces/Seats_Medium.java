// https://codeforces.com/contest/2188/problem/B

import java.util.*;
public class Solution{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t--> 0) {
            int n = input.nextInt();
            String s = input.next();
            int res = 0;
            int pre = -1;
            if (n <= 2) {
                System.out.println(1);
                continue;
            }
            char[] ch = s.toCharArray();
            if (ch[0] == '0' && ch[1] == '0') ch[1] = '1';
            if (ch[n - 1] == '0' && ch[n - 2] == '0') ch[n - 2] = '1';
            for (int i = 0; i < n; i++)
            {
                if (ch[i] == '0')
                {
                    if (i - pre >= 3)
                    {
                        res++;
                        ch[i] = '1';
                        pre = i;
                    }
                }
                else
                {
                    res++;
                    pre = i;
                }
            }
            System.out.println(res);
        }
    }
}
