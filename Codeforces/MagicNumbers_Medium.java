// https://codeforces.com/problemset/problem/320/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int i = 0;
        boolean isMagic = true;
        while (i < s.length()) {
            if (i + 2 < s.length() && s.substring(i, i + 3).equals("144")) {
                i += 3;
            } else if (i + 1 < s.length() && s.substring(i, i + 2).equals("14")) {
                i += 2;
            } else if (s.charAt(i) == '1') {
                i += 1;
            } else {
                isMagic = false;
                break;
            }
        }
        System.out.println(isMagic ? "YES" : "NO");
    }
}
