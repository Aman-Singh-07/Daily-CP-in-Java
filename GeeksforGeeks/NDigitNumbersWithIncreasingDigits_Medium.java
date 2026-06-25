// https://www.geeksforgeeks.org/problems/n-digit-numbers-with-digits-in-increasing-order5903/1

import java.util.ArrayList;

class Solution {
    public static ArrayList<Integer> increasingNumbers(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        if (n > 9) return list;
        if (n == 1) {
            for (int i = 0; i <= 9; i++) {
                list.add(i);
            }
            return list;
        }
        generateNumbers(1, 0, n, list);
        return list;
    }
    
    public static void generateNumbers(int startDigit, int currentNum, int remainingDigits, ArrayList<Integer> list) {
        if (remainingDigits == 0) {
            list.add(currentNum);
            return;
        }
        for (int i = startDigit; i <= 9; i++) {
            generateNumbers(i + 1, currentNum * 10 + i, remainingDigits - 1, list);
        }
    }
}
