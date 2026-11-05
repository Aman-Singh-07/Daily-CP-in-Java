// https://leetcode.com/problems/find-the-distance-value-between-two-arrays/description/?envType=daily-question&envId=2026-11-05

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        for(int i=0;i<arr1.length;i++){
            boolean isTrue=true;
            for(int j=0;j<arr2.length;j++){
                if(Math.abs(arr1[i]-arr2[j])<=d){
                    isTrue=false;
                    break;
                }
            }
            if(isTrue) count++;
        }
        return count;
    }
}
