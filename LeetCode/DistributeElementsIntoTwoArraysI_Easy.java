// https://leetcode.com/problems/distribute-elements-into-two-arrays-i/description/?envType=daily-question&envId=2026-08-20

class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        l1.add(nums[0]);
        l2.add(nums[1]);
        
        for(int i=2;i<nums.length;i++){
            if(l1.get(l1.size()-1)>l2.get(l2.size()-1)) l1.add(nums[i]);
            else l2.add(nums[i]);
        }
        int[] res=new int[nums.length];
        int i=0;
        for(int num:l1){
            res[i++]=num;
        }
        for(int num:l2){
            res[i++]=num;
        }
        return res;
    }
}
