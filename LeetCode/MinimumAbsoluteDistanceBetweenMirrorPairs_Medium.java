// https://leetcode.com/problems/minimum-absolute-distance-between-mirror-pairs/?envType=daily-question&envId=2026-04-17

class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int min=Integer.MAX_VALUE;
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(map.containsKey(num)){
                map.get(num).add(i);
            }else{
                ArrayList<Integer> temp=new ArrayList<>();
                temp.add(i);
                map.put(num,temp);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(reverse(nums[i]))){
                ArrayList<Integer> list=map.get(reverse(nums[i]));
                for(int j:list){
                    if(j>i){
                        min=Math.min((j-i),min);
                        break;
                    }
                }
            }
            if(min==1) break;
        }

        return min==Integer.MAX_VALUE?-1:min;
    }
    public static int reverse(int num){
        int rev=0;
        while(num>0){
            rev=rev*10+num%10;
            num/=10;
        }
        return rev;
    }
}
