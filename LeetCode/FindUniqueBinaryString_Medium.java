// https://leetcode.com/problems/find-unique-binary-string/?envType=daily-question&envId=2026-03-08

class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<nums.length;i++){
            res.append(nums[i].charAt(i)=='0'?'1':'0');
        }
        return res.toString();
    }
}
