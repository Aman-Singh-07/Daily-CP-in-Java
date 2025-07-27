// https://leetcode.com/problems/count-hills-and-valleys-in-an-array/description/?envType=daily-question&envId=2025-07-27

class Solution {
    public int countHillValley(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                list.add(nums[i]);
            }
        }
        int count=0;
        for(int i=1;i<list.size()-1;i++){
            int prev=list.get(i-1);
            int curr=list.get(i);
            int next=list.get(i+1);

            if((curr>prev && curr>next) || (curr<prev && curr<next)){
                count++;
            }
        }

        return count;
    }
}
