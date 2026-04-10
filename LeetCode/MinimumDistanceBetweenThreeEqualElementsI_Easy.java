// https://leetcode.com/problems/minimum-distance-between-three-equal-elements-i/description/?envType=daily-question&envId=2026-04-10

class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer,TreeSet<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.get(nums[i]).add(i);
            }else{
                TreeSet<Integer> set=new TreeSet<>();
                set.add(i);
                map.put(nums[i],set);
            }
        }
        int min=Integer.MAX_VALUE;
        for(TreeSet<Integer> list:map.values()){
            if(list.size()>=3){
                int a=list.pollFirst();
                int b=list.pollFirst();
                int c=list.pollFirst();
                min=Math.min(min,Math.abs(a-b)+Math.abs(b-c)+Math.abs(c-a));
                while(list.size()!=0){
                    a=b;
                    b=c;
                    c=list.pollFirst();
                    min=Math.min(min,Math.abs(a-b)+Math.abs(b-c)+Math.abs(c-a));
                }
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}
