// https://leetcode.com/problems/summary-ranges/description/

class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> list=new ArrayList<>();
        if(nums.length==0) return list;
        int prev=nums[0];
        int curr=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]-curr!=1){
                if(curr!=prev) list.add(prev+"->"+curr);
                else list.add(prev+"");
                prev=nums[i];
            }
            curr=nums[i];
        }
        if(curr!=prev) list.add(prev+"->"+curr);
        else list.add(prev+"");
        return list;
    }
}
