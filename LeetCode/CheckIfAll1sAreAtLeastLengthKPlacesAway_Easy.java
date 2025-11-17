// https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/description/?envType=daily-question&envId=2025-11-17

class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                list.add(i);
            }
        }
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i+1)-list.get(i)<=(k)){
                return false;
            }
        }
        return true;
    }
}
