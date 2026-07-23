//

class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
        if(n<=2) return n;
        int res=0;
        for(int val:nums){
            res|=val;
        }
        return res+1;
    }
}
