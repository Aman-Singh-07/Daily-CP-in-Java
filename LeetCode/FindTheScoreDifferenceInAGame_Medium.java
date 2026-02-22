// https://leetcode.com/problems/find-the-score-difference-in-a-game/description/

class Solution {
    public int scoreDifference(int[] nums) {
        int num1=0;
        int num2=0;
        boolean flag1=true;
        boolean flag2=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                if(flag1==true){
                    flag1=false;
                    flag2=true;
                }else{
                    flag1=true;
                    flag2=false;
                }
            }
            if((i+1)%6==0){
                if(flag1==true){
                    flag1=false;
                    flag2=true;
                }else{
                    flag1=true;
                    flag2=false;
                }
            }
            if(flag1) num1+=nums[i];
            else num2+=nums[i];
        }
        return num1-num2;
    }
}
