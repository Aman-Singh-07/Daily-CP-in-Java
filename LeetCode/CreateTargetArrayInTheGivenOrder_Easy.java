// https://leetcode.com/problems/create-target-array-in-the-given-order/

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(index[i],nums[i]);
        }
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=list.get(i);
        }
        return res;
    }
}
