// https://leetcode.com/problems/find-the-sum-of-encrypted-integers/description/

class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int reqSum=0;
        for(int i=0;i<nums.length;i++){
            reqSum+=maxDigit(nums[i]);
        }
        return reqSum;
    }
    public int maxDigit(int num){
        ArrayList<Integer> list=new ArrayList<>();
        int count=0;
        while(num>0){
            int r=num%10;
            list.add(r);
            num/=10;
            count++;
        }
        int max=0;
        for(int i:list){
            if(i>max){
                max=i;
            }
        }
        int resNum=0;
        while(count-->0){
            resNum=resNum*10+max;
        }

        return resNum;
    }
}
