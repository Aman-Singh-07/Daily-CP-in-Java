// https://leetcode.com/problems/smallest-missing-integer-greater-than-sequential-prefix-sum/description/?envType=daily-question&envId=2026-08-11

class Solution {
    public int missingInteger(int[] nums) {
        int num=nums[0];
        HashSet<Integer> set=new HashSet<>();
        for(int val:nums){
            set.add(val);
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]+1){
                break;
            }
            num+=nums[i];
        }
        while(set.contains(num)){
            num++;
        }
        return num;
        
    }
}
