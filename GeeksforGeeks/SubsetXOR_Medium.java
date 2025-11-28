// https://www.geeksforgeeks.org/problems/subset-xor--175953/1

import java.util.*;

class Solution {
    public static ArrayList<Integer> subsetXOR(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int totalXor = 0;
        for (int i = 1; i <= n; i++) {
            totalXor ^= i;
        }
        if (totalXor == n) {
            for (int i = 1; i <= n; i++) {
                list.add(i);
            }
            return list;
        }
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int remove = totalXor ^ n;
        list.remove(Integer.valueOf(remove));

        return list;
    }
}
