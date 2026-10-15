// https://leetcode.com/problems/subarrays-distinct-element-sum-of-squares-i/description/?envType=daily-question&envId=2026-10-15

class Solution {
    public int sumCounts(List<Integer> nums) {
        int res=0;
        for(int i=0;i<nums.size();i++){
            HashSet<Integer> set=new HashSet<>();
            int count=0;
            for(int j=i;j<nums.size();j++){
                int x=nums.get(j);
                if(!set.contains(x)){
                    set.add(x);
                    count++;
                }
                res+=count*count;
            }

        }
        return res;
    }
}
