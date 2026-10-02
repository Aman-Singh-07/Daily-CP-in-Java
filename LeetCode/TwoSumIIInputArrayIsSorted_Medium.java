// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr=new int[2];
        for(int i=0;i<numbers.length;i++){
            int req=target-numbers[i];
            int left=i+1;
            int right=numbers.length-1;
            while(left<=right){
                int mid=left+(right-left)/2;
                if(numbers[mid]==req){
                    arr[0]=i+1;
                    arr[1]=mid+1;
                    return arr;
                }else if(numbers[mid]>req) right=mid-1;
                else left=mid+1;
            }
        }
        return arr;
    }
}
