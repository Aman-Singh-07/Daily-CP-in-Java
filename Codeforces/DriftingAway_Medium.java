// https://codeforces.com/contest/2169/problem/B

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            String s = input.next();
            int n = s.length();
            boolean isTrue=false;
            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i) != '<' && s.charAt(i + 1) != '>') {
                    System.out.println("-1");
                    isTrue=true;
                    break;
                }
            }
            if(!isTrue){
                int ans = 0;
                for (int i = 0; i < n; i++) {
                    int cur = 0;
                    if (s.charAt(i) == '<') cur = i + 1;
                    else if (s.charAt(i) == '>') cur = n - i;
                    else cur = Math.max(i + 1, n - i);
                    ans = Math.max(ans, cur);
                }
                System.out.println(ans);
            }
        }
    }
}
