// https://leetcode.com/problems/shortest-distance-to-target-string-in-a-circular-array/?envType=daily-question&envId=2026-04-15

class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        for(int i=0;i<words.length;i++){
            if(words[(startIndex+i)%words.length].equals(target) ||  words[(startIndex-i+words.length)%(words.length)].equals(target)){
                return i;
            }
        }
        
        return -1;
    }
}
