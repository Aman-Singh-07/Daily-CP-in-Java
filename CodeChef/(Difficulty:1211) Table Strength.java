//

class Solution {
    public int maximumLength(int[] nums) {
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length-1;j++){
                if(!((nums[i]+nums[j])%2==(nums[j]+nums[j+1])%2)){
                    max=Math.max(max,count);
                    count=0;
                }
                count++;
            }
        }
        max=Math.max(max,count);
        return max;
        
    }
}
