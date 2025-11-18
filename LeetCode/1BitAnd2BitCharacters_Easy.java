// https://leetcode.com/problems/1-bit-and-2-bit-characters/description/?envType=daily-question&envId=2025-11-18

class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i=0;
        for(;i<bits.length-1;){
            i+=bits[i]+1;
        }
        return i==bits.length-1;
    }
}
