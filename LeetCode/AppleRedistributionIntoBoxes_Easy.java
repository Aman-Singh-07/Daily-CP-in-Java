// https://leetcode.com/problems/apple-redistribution-into-boxes/description/?envType=daily-question&envId=2025-12-24

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum=0;
        for(int num:apple) sum+=num;
        Arrays.sort(capacity);
        int count=0;
        int i=capacity.length-1;
        while(sum>0){
            sum-=capacity[i--];
            count++;
        }
        return count;
    }
}
