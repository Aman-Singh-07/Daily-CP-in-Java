// https://leetcode.com/problems/find-the-maximum-number-of-elements-in-subset/?envType=daily-question&envId=2026-06-27

class Solution {
    public int maximumLength(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int x:nums)
            mp.put(x,mp.getOrDefault(x,0)+1);

        int ans=1;

        for(int x:nums){
            if(x==1){
                if(mp.get(x)%2!=0)
                    ans=Math.max(ans,mp.get(x));
                else
                    ans=Math.max(ans,mp.get(x)-1);
            }
            else{
                int ct=0;

                if(mp.get(x)>=2){
                    long curr=x;

                    while(curr<=Integer.MAX_VALUE&&mp.containsKey((int)curr)){
                        if(mp.get((int)curr)==1){
                            ct++;
                            break;
                        }

                        ct++;

                        if(curr>Long.MAX_VALUE/curr)
                            break;

                        curr*=curr;
                    }
                }

                ans=Math.max(ans,ct*2-1);
            }
        }

        return ans;
    }
}
