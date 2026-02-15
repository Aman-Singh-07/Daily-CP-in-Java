// https://leetcode.com/problems/first-element-with-unique-frequency/

class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int num:map.keySet()){
            m.put(map.get(num),m.getOrDefault(map.get(num),0)+1);
        }
        for(int num:nums){
            int res=map.get(num);
            if(m.get(res)==1) return num;
        }
        return -1;
        
    }
}
