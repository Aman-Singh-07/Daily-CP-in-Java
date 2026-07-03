// https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1?page=1&status=unsolved&sortBy=submissions

class Solution {
    public int longestSubarray(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int maxLen = 0;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }
            int rem = currentSum - k;
            if (map.containsKey(rem)) {
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if (!map.containsKey(currentSum)) {
                map.put(currentSum, i);
            }
        }
        
        return maxLen;
    }
}
