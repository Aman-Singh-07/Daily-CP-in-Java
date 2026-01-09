//  https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/description/?envType=daily-question&envId=2026-01-09

class Solution {
    public int longestSubarray(int[] nums) {
        int count=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                list.add(count);
                list.add(0);
                count=0;
            }
            else count++;
        }
        if(nums[nums.length-1]==1){
            list.add(count);
        }
        if(list.size()==1) return list.get(0)-1;
        if(list.size()==2) return list.get(0)+list.get(1);
        int max=0;
        for(int i=1;i<list.size()-1;i++){
            max=Math.max(max,list.get(i-1)+list.get(i)+list.get(i+1));
        }
        return max;
    }
}
