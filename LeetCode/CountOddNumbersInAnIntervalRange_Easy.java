// https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/description/?envType=problem-list-v2&envId=n32iyzu3

class Solution {
    public int countOdds(int low, int high) {
        return (high%2!=0 && low%2!=0)?(((high-low)+1)/2)+1:((high-low)+1)/2;
        
    }
}
