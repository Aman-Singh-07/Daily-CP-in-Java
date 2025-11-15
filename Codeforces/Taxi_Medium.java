// https://codeforces.com/problemset/problem/158/B

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int one = map.getOrDefault(1, 0);
        int two = map.getOrDefault(2, 0);
        int three = map.getOrDefault(3, 0);
        int four = map.getOrDefault(4, 0);

        int taxis = four; 

        int pair31 = Math.min(three, one);
        taxis += three;
        one -= pair31;

        taxis += two / 2; 
        if (two % 2 == 1) { 
            taxis++;
            one -= Math.min(2, one); 
        }

        if (one > 0) {
            taxis += (one + 3) / 4; 
        }

        System.out.println(taxis);
    }
}
