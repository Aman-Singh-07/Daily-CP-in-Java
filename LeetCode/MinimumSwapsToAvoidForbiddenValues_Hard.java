// https://leetcode.com/problems/minimum-swaps-to-avoid-forbidden-values/description/

class Solution {
    public int minSwaps(int[] nums, int[] forbidden) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==forbidden[i]){
                count++;
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        if(count==0) return 0;
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        for(int num:forbidden){
            map2.put(num,map2.getOrDefault(num,0)+1);
        }
        for(int num:nums){
            map1.put(num,map1.getOrDefault(num,0)+1);
        }
        if(isTrue(map1,map2, nums.length)) return -1;
        int max=0;
        for(int num:map.values()){
            max=Math.max(max,num);
        }
        int res=Math.min(count/2,count-max);
        return count-res;
        
    }

    public static boolean isTrue(HashMap<Integer,Integer> map1,HashMap<Integer,Integer> map2, int num){
        for(HashMap.Entry<Integer,Integer> e:map1.entrySet()){
            if (e.getValue() > num-map2.getOrDefault(e.getKey(),0)) return true;
        }
        return false;
    }
}
