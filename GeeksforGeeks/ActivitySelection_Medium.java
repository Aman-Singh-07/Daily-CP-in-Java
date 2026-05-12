// https://www.geeksforgeeks.org/problems/activity-selection-1587115620/1

import java.util.*;

class Solution {
    public int activitySelection(int[] start, int[] finish) {
        int n = start.length;
        int[][] activities = new int[n][2];

        for (int i = 0; i < n; i++) {
            activities[i][0] = start[i];
            activities[i][1] = finish[i];
        }

        Arrays.sort(activities, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 0;
        int lastFinishTime = -1;

        for (int i = 0; i < n; i++) {
            if (activities[i][0] > lastFinishTime) {
                count++;
                lastFinishTime = activities[i][1];
            }
        }

        return count;
    }
}
