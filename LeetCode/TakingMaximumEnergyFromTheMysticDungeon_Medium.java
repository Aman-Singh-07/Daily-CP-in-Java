// https://leetcode.com/problems/taking-maximum-energy-from-the-mystic-dungeon/description/?envType=daily-question&envId=2025-10-10

class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int max=energy[energy.length-1];
        for (int i=energy.length-1;i>=0;i--){
            if (i+k<energy.length){
                energy[i]+=energy[i+k];
            }
            max=Math.max(max,energy[i]);
        }
        return max;
    }
}
