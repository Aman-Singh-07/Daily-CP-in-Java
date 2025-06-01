// https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum/

class Solution {
    public int minElement(int[] nums) {
        int[] arr=new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            while(nums[i]>0){
                int r=nums[i]%10;
                sum+=r;
                nums[i]/=10;
            }
            arr[k]=sum;
            k++;
        }
        int min=arr[0];
        for(int i=1;i<nums.length;i++){
            if(arr[i]<min) min=arr[i];
        }
        return min;
        
    }
}
