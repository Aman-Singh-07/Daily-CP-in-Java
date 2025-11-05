// https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/description/

class Solution {
    public int[] minOperations(String boxes) {
        int[] ans=new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){
            int sum=0;
            for(int j=0;j<boxes.length();j++){
                if(boxes.charAt(j)=='1'){
                    sum+=Math.abs(i-j);
                }
            }
            ans[i]=sum;
        }
        return ans;
    }
}
