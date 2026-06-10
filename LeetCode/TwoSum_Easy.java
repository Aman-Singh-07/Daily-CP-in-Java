// https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int idx1=-1;
        int idx2=-1;
        for(int i=0;i<nums.length;i++){
            int num2=target-nums[i];
            if(map.containsKey(num2)){
                idx1=i;
                idx2=map.get(num2);
                break;
            }
            map.put(nums[i],i);
        }
        int[] res=new int[2];
        res[0]=idx1;
        res[1]=idx2;
        return res;
    }
}
