// https://leetcode.com/problems/sort-characters-by-frequency/description/

class Solution {
    public String frequencySort(String s) {
        int[] arr = new int[128];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }

        int[][] res = new int[128][2];
        for (int i = 0; i < 128; i++) {
            res[i][0] = i;
            res[i][1] = arr[i];
        }

        Arrays.sort(res, (a, b) -> Integer.compare(b[1], a[1]));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 128; i++) {
            if (res[i][1] == 0)
                break;
            while (res[i][1] > 0) {
                res[i][1] -= 1;
                sb.append((char) res[i][0]);
            }
        }
        return sb.toString();
    }
}
