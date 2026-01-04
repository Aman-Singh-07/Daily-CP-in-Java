// https://leetcode.com/problems/minimum-subarray-length-with-distinct-sum-at-least-k/description/


class Solution {
    public int minLength(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();
        int j=0;
        long sum=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)==1) sum+=num;
            while(sum>=k){
                map.put(nums[j],map.get(nums[j])-1);
                if(map.get(nums[j])==0) sum-=nums[j];
                min=Math.min(i-j+1,min);
                j++;
            }
        }
        return isTrue(min)?-1:min;
    }

    public static boolean isTrue(int min){
        return min==Integer.MAX_VALUE;
    }
}
