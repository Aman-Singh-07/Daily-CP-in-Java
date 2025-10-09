// https://leetcode.com/problems/find-the-minimum-amount-of-time-to-brew-potions/?envType=daily-question&envId=2025-10-09

class Solution {
    public long minTime(int[] skill, int[] mana) {
        long[] arr=new long[skill.length];
        for(int i=0;i<mana.length;i++){
            long count=0;
            for(int j=0;j<skill.length;j++){
                count=Math.max(count,arr[j])+(long) skill[j]*mana[i];
            }
            arr[skill.length-1]=count;
            for(int k=skill.length-2;k>=0;k--){
                arr[k]=arr[k+1]-(long)skill[k+1]*mana[i];
            }
            
        }
        return arr[skill.length-1];
        
    }
}
