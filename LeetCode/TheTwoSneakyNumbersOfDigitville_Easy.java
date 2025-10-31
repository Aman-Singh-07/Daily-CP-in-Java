// https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville/description/?envType=daily-question&envId=2025-10-31

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int count=0;
        int[] arr=new int[2];
        int k=0;
        for(int num:nums){
            if(set.contains(num)){
                arr[k++]=num;
            }
            if(k==2) break;
            set.add(num);
        }
        return arr;
    }
}
