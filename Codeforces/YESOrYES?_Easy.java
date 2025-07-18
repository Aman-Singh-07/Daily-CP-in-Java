// https://codeforces.com/contest/1703/problem/A

import java.util.*;
 
public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
 
        while (t-- > 0) {
            String S = input.next();
 
            if (S.toUpperCase().equals("YES")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
