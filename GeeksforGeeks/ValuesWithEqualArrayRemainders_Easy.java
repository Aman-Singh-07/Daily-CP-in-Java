// https://www.geeksforgeeks.org/problems/k-modulus-array-element0255/1

import java.util.*;

class Solution {
    public int sameMod(int[] arr) {
        int n = arr.length;
        if (n <= 1) return -1;
        Arrays.sort(arr);

        if (arr[0] == arr[n - 1]) return -1;

        int currentGcd = arr[1] - arr[0];

        for (int i = 2; i < n; i++) {
            currentGcd = gcd(currentGcd, arr[i] - arr[i - 1]);
            if (currentGcd == 1) break; 
        }
        int count = 0;
        for (int i = 1; i * i <= currentGcd; i++) {
            if (currentGcd % i == 0) {
                count++;
                if (i * i != currentGcd) {
                    count++;
                }
            }
        }

        return count;
    }
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
