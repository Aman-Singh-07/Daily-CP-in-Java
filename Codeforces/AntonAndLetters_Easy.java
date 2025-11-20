// https://codeforces.com/problemset/problem/443/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        s = s.replace("{", "")
             .replace("}", "")
             .replace(", ", "");

        HashSet<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                set.add(ch);
            }
        }

        System.out.println(set.size());
    }
}
