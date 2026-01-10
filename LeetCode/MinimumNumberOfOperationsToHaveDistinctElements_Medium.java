// https://leetcode.com/problems/minimum-number-of-operations-to-have-distinct-elements/description/

class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Boolean> map = new HashMap<>();
        int i=0;
        for(i=nums.length-1;i>=0;i--){
            if(map.containsKey(nums[i])){
                break;
            }
            map.put(nums[i],true);
        }
        return (i+3)/3;
    }
}
