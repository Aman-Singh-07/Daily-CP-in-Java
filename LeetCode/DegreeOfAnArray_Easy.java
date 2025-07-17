// https://leetcode.com/problems/degree-of-an-array/

class Solution {
    public int findShortestSubArray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int element : set) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (element == nums[i]) {
                    count++;
                }
            }
            map.put(element, count);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        ArrayList<Integer> result = new ArrayList<>();
        int maxFreq = list.get(list.size() - 1).getValue();
        for (int j = list.size() - 1; j >= 0; j--) {
            Integer key = list.get(j).getKey();
            if (map.get(key) != maxFreq) break;
            int start = -1, end = -1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == key) {
                    start = i;
                    break;
                }
            }
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] == key) {
                    end = i;
                    break;
                }
            }
            result.add(end - start + 1);
        }
        Collections.sort(result);
        return result.get(0);
    }
}
