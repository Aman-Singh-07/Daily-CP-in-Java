// https://www.geeksforgeeks.org/problems/maximum-repeating-number4858/1?page=1&difficulty=Easy&status=unsolved&sortBy=difficulty

import java.util.*;

class Solution {
    int maxRepeating(int k, int[] arr) {
        Arrays.sort(arr);
        int count = 1;
        int maxCount = 1;
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (count > maxCount || (count == maxCount && arr[i - 1] < min)) {
                    maxCount = count;
                    min = arr[i - 1];
                }
                count = 1; 
            }
        }

        if (count > maxCount || (count == maxCount && arr[arr.length - 1] < min)) {
            min = arr[arr.length - 1];
        }

        return min;
    }
}
