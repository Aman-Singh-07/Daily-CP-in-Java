// https://www.geeksforgeeks.org/problems/minimum-sprinklers/1

import java.util.*;

class Solution {
    public int minMen(int arr[]) {
        int n = arr.length;
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] != -1) {
                int left = Math.max(0, i - arr[i]);
                int right = Math.min(n - 1, i + arr[i]);
                list.add(new int[]{left, right});
            }
        }
        list.sort((a,b)->a[0]-b[0]);
        int count=0;
        int coveredTill=0;
        int i=0;
        while(coveredTill<n){
            int farthest=coveredTill;
            while (i<list.size() && list.get(i)[0] <= coveredTill){
                farthest=Math.max(farthest,list.get(i)[1]+1);
                i++;
            }
            if(farthest==coveredTill) return -1;
            coveredTill=farthest;
            count++;
        }
        return count;
    }
}
