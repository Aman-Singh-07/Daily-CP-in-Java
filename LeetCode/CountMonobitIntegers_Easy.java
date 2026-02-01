// https://leetcode.com/problems/count-monobit-integers/

class Solution {
    public int countMonobit(int n) {
        int count=1;
        int i=1;
        int j=2;
        while(i<=n){
            count++;
            i=(int) Math.pow(2,j)-1;
            j++;
        }
        return count;
    }
}
