// https://leetcode.com/problems/find-x-sum-of-all-k-long-subarrays-i/?envType=daily-question&envId=2025-11-04

class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n=nums.length;
        int[] result=new int[n-k+1];
        for(int i=0;i<=n-k;i++){
            HashMap<Integer, Integer> freqMap=new HashMap<>();
            for(int j=i;j<i+k;j++){
                freqMap.put(nums[j],freqMap.getOrDefault(nums[j],0)+1);
            }
            ArrayList<Map.Entry<Integer,Integer>> sortedEntries=new ArrayList<>(freqMap.entrySet());
            sortedEntries.sort((a,b)->{
                if(!a.getValue().equals(b.getValue())){
                    return b.getValue()-a.getValue(); 
                }else{
                    return b.getKey()-a.getKey(); 
                }
            });
            int sum=0;
            int count=0;
            for(Map.Entry<Integer,Integer> entry:sortedEntries){
                if(count>=x) break;
                sum+=entry.getKey()*entry.getValue();
                count++;
            }
            result[i]=sum;
        }
        return result;
    }
}
