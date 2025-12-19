// https://leetcode.com/problems/sort-array-by-increasing-frequency/

class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (int num : nums){
            list.add(num);
        }
        Collections.sort(list,(a,b)->{
            int fa=freq.get(a),fb=freq.get(b);
            if (fa==fb){
                return b-a; 
            }
            return fa-fb;
        });
        int[] result = new int[nums.length];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
