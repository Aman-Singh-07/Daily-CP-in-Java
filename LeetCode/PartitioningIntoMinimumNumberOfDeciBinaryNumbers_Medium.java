//  https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/description/?envType=daily-question&envId=2026-03-01

class Solution {
    public int minPartitions(String n) {
        int[] freq=new int[10];
        for(char ch:n.toCharArray()){
            freq[ch-'0']++;
        }
        for(int i=9;i>=0;i--){
            if(freq[i]!=0) return i;
        }
        return 0;
    }
}
