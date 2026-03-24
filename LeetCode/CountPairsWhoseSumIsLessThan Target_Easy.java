// https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count=0;
        Collections.sort(nums);
        for(int i=0;i<nums.size();i++){
            for(int j=nums.size()-1;j>i;j--){
                if(nums.get(i)+nums.get(j)<target){
                    count+=j-i;
                    break;
                }
            }
        }
        return count;
    }
}
